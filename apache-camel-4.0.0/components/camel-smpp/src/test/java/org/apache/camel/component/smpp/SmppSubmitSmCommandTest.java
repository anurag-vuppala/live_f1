/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.smpp;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TimeZone;

import org.apache.camel.Exchange;
import org.apache.camel.ExchangePattern;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.support.DefaultExchange;
import org.jsmpp.bean.Alphabet;
import org.jsmpp.bean.DataCodings;
import org.jsmpp.bean.ESMClass;
import org.jsmpp.bean.NumberingPlanIndicator;
import org.jsmpp.bean.OptionalParameter;
import org.jsmpp.bean.OptionalParameter.Tag;
import org.jsmpp.bean.RegisteredDelivery;
import org.jsmpp.bean.ReplaceIfPresentFlag;
import org.jsmpp.bean.SMSCDeliveryReceipt;
import org.jsmpp.bean.TypeOfNumber;
import org.jsmpp.session.SMPPSession;
import org.jsmpp.session.SubmitSmResult;
import org.jsmpp.util.MessageId;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.not;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.hamcrest.MockitoHamcrest.argThat;

public class SmppSubmitSmCommandTest {

    private static TimeZone defaultTimeZone;

    private SMPPSession session;
    private SmppConfiguration config;
    private SmppSubmitSmCommand command;

    @BeforeAll
    public static void setUpBeforeClass() {
        defaultTimeZone = TimeZone.getDefault();

        TimeZone.setDefault(TimeZone.getTimeZone("GMT"));
    }

    @AfterAll
    public static void tearDownAfterClass() {
        if (defaultTimeZone != null) {
            TimeZone.setDefault(defaultTimeZone);
        }
    }

    @BeforeEach
    public void setUp() {
        session = mock(SMPPSession.class);
        config = new SmppConfiguration();
        config.setServiceType("CMT");

        command = new SmppSubmitSmCommand(session, config);
    }

    @Test
    public void executeWithConfigurationData() throws Exception {
        Exchange exchange = new DefaultExchange(new DefaultCamelContext(), ExchangePattern.InOut);
        exchange.getIn().setHeader(SmppConstants.COMMAND, "SubmitSm");
        exchange.getIn().setHeader(SmppConstants.ID, "1");
        exchange.getIn().setBody(
                "1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");
        when(session.submitShortMessage(eq("CMT"), eq(TypeOfNumber.UNKNOWN), eq(NumberingPlanIndicator.UNKNOWN), eq("1616"),
                eq(TypeOfNumber.UNKNOWN), eq(NumberingPlanIndicator.UNKNOWN), eq("1717"), eq(new ESMClass()), eq((byte) 0),
                eq((byte) 1),
                (String) isNull(), (String) isNull(), eq(new RegisteredDelivery(SMSCDeliveryReceipt.SUCCESS_FAILURE)),
                eq(ReplaceIfPresentFlag.DEFAULT.value()),
                eq(DataCodings.newInstance((byte) 0)), eq((byte) 0),
                eq("1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890"
                        .getBytes())))
                .thenReturn(new SubmitSmResult(new MessageId("1"), null));

        command.execute(exchange);

        assertEquals(Collections.singletonList("1"), exchange.getMessage().getHeader(SmppConstants.ID));
        assertEquals(1, exchange.getMessage().getHeader(SmppConstants.SENT_MESSAGE_COUNT));
    }

    @Test
    @Disabled()
    public void executeLongBody() throws Exception {
        byte[] firstSM = new byte[] {
                5, 0, 3, 1, 2, 1, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51,
                52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54,
                55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52,
                53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50,
                51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48,
                49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56,
                57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51 };
        byte[] secondSM = new byte[] { 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48 };

        Exchange exchange = new DefaultExchange(new DefaultCamelContext(), ExchangePattern.InOut);
        exchange.getIn().setHeader(SmppConstants.COMMAND, "SubmitSm");
        exchange.getIn().setHeader(SmppConstants.ID, "1");
        exchange.getIn().setBody(
                "12345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901");
        when(session.submitShortMessage(eq("CMT"), eq(TypeOfNumber.UNKNOWN), eq(NumberingPlanIndicator.UNKNOWN), eq("1616"),
                eq(TypeOfNumber.UNKNOWN), eq(NumberingPlanIndicator.UNKNOWN), eq("1717"), eq(new ESMClass()), eq((byte) 0),
                eq((byte) 1),
                (String) isNull(), (String) isNull(), eq(new RegisteredDelivery(SMSCDeliveryReceipt.SUCCESS_FAILURE)),
                eq(ReplaceIfPresentFlag.DEFAULT.value()),
                eq(DataCodings.newInstance((byte) 0)), eq((byte) 0), eq(firstSM)))
                .thenReturn(new SubmitSmResult(new MessageId("1"), null));
        when(session.submitShortMessage(eq("CMT"), eq(TypeOfNumber.UNKNOWN), eq(NumberingPlanIndicator.UNKNOWN), eq("1616"),
                eq(TypeOfNumber.UNKNOWN), eq(NumberingPlanIndicator.UNKNOWN), eq("1717"), eq(new ESMClass()), eq((byte) 0),
                eq((byte) 1),
                (String) isNull(), (String) isNull(), eq(new RegisteredDelivery(SMSCDeliveryReceipt.SUCCESS_FAILURE)),
                eq(ReplaceIfPresentFlag.DEFAULT.value()),
                eq(DataCodings.newInstance((byte) 0)), eq((byte) 0), eq(secondSM)))
                .thenReturn(new SubmitSmResult(new MessageId("2"), null));

        command.execute(exchange);

        assertEquals(Arrays.asList("1", "2"), exchange.getMessage().getHeader(SmppConstants.ID));
        assertEquals(2, exchange.getMessage().getHeader(SmppConstants.SENT_MESSAGE_COUNT));
    }

    @Test
    public void executeLongBodyRejection() throws Exception {
        byte[] firstSM = new byte[] {
                5, 0, 3, 1, 2, 1, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51,
                52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54,
                55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52,
                53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50,
                51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48,
                49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56,
                57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51 };
        byte[] secondSM = new byte[] { 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48 };

        Exchange exchange = new DefaultExchange(new DefaultCamelContext(), ExchangePattern.InOut);
        exchange.getIn().setHeader(SmppConstants.COMMAND, "SubmitSm");
        exchange.getIn().setHeader(SmppConstants.ID, "1");
        exchange.getIn().setHeader(SmppConstants.SPLITTING_POLICY, "REJECT");
        exchange.getIn().setBody(
                "12345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901");
        when(session.submitShortMessage(eq("CMT"), eq(TypeOfNumber.UNKNOWN), eq(NumberingPlanIndicator.UNKNOWN), eq("1616"),
                eq(TypeOfNumber.UNKNOWN), eq(NumberingPlanIndicator.UNKNOWN), eq("1717"), eq(new ESMClass()), eq((byte) 0),
                eq((byte) 1),
                (String) isNull(), (String) isNull(), eq(new RegisteredDelivery(SMSCDeliveryReceipt.SUCCESS_FAILURE)),
                eq(ReplaceIfPresentFlag.DEFAULT.value()),
                eq(DataCodings.newInstance((byte) 0)), eq((byte) 0), eq(firstSM)))
                .thenReturn(new SubmitSmResult(new MessageId("1"), null));
        when(session.submitShortMessage(eq("CMT"), eq(TypeOfNumber.UNKNOWN), eq(NumberingPlanIndicator.UNKNOWN), eq("1616"),
                eq(TypeOfNumber.UNKNOWN), eq(NumberingPlanIndicator.UNKNOWN), eq("1717"), eq(new ESMClass()), eq((byte) 0),
                eq((byte) 1),
                (String) isNull(), (String) isNull(), eq(new RegisteredDelivery(SMSCDeliveryReceipt.SUCCESS_FAILURE)),
                eq(ReplaceIfPresentFlag.DEFAULT.value()),
                eq(DataCodings.newInstance((byte) 0)), eq((byte) 0), eq(secondSM)))
                .thenReturn(new SubmitSmResult(new MessageId("2"), null));

        assertThrows(SmppException.class, () -> command.execute(exchange));
    }

    @Test
    public void executeLongBodyTruncation() throws Exception {
        byte[] firstSM = new byte[] {
                49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56,
                57, 48, 49, 50, 51, 52, 53, 54,
                55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52,
                53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50,
                51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48,
                49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56,
                57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54,
                55, 56, 57 };

        Exchange exchange = new DefaultExchange(new DefaultCamelContext(), ExchangePattern.InOut);
        exchange.getIn().setHeader(SmppConstants.COMMAND, "SubmitSm");
        exchange.getIn().setHeader(SmppConstants.ID, "1");
        exchange.getIn().setHeader(SmppConstants.SPLITTING_POLICY, "TRUNCATE");
        exchange.getIn().setBody(
                "12345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901");
        when(session.submitShortMessage(eq("CMT"), eq(TypeOfNumber.UNKNOWN), eq(NumberingPlanIndicator.UNKNOWN), eq("1616"),
                eq(TypeOfNumber.UNKNOWN), eq(NumberingPlanIndicator.UNKNOWN), eq("1717"), eq(new ESMClass()), eq((byte) 0),
                eq((byte) 1),
                (String) isNull(), (String) isNull(), eq(new RegisteredDelivery(SMSCDeliveryReceipt.SUCCESS_FAILURE)),
                eq(ReplaceIfPresentFlag.DEFAULT.value()),
                eq(DataCodings.newInstance((byte) 0)), eq((byte) 0), eq(firstSM)))
                .thenReturn(new SubmitSmResult(new MessageId("1"), null));

        command.execute(exchange);

        assertEquals(Collections.singletonList("1"), exchange.getMessage().getHeader(SmppConstants.ID));
        assertEquals(1, exchange.getMessage().getHeader(SmppConstants.SENT_MESSAGE_COUNT));
    }

    @Test
    public void execute() throws Exception {
        Exchange exchange = new DefaultExchange(new DefaultCamelContext(), ExchangePattern.InOut);
        exchange.getIn().setHeader(SmppConstants.COMMAND, "SubmitSm");
        exchange.getIn().setHeader(SmppConstants.ID, "1");
        exchange.getIn().setHeader(SmppConstants.SOURCE_ADDR_TON, TypeOfNumber.NATIONAL.value());
        exchange.getIn().setHeader(SmppConstants.SOURCE_ADDR_NPI, NumberingPlanIndicator.NATIONAL.value());
        exchange.getIn().setHeader(SmppConstants.SOURCE_ADDR, "1818");
        exchange.getIn().setHeader(SmppConstants.DEST_ADDR_TON, TypeOfNumber.INTERNATIONAL.value());
        exchange.getIn().setHeader(SmppConstants.DEST_ADDR_NPI, NumberingPlanIndicator.INTERNET.value());
        exchange.getIn().setHeader(SmppConstants.DEST_ADDR, "1919");
        exchange.getIn().setHeader(SmppConstants.SCHEDULE_DELIVERY_TIME, new Date(1111111));
        exchange.getIn().setHeader(SmppConstants.VALIDITY_PERIOD, new Date(2222222));
        exchange.getIn().setHeader(SmppConstants.PROTOCOL_ID, (byte) 1);
        exchange.getIn().setHeader(SmppConstants.PRIORITY_FLAG, (byte) 2);
        exchange.getIn().setHeader(SmppConstants.REGISTERED_DELIVERY,
                new RegisteredDelivery(SMSCDeliveryReceipt.FAILURE).value());
        exchange.getIn().setHeader(SmppConstants.REPLACE_IF_PRESENT_FLAG, ReplaceIfPresentFlag.REPLACE.value());
        exchange.getIn().setBody("short message body");
        when(session.submitShortMessage(eq("CMT"), eq(TypeOfNumber.NATIONAL), eq(NumberingPlanIndicator.NATIONAL), eq("1818"),
                eq(TypeOfNumber.INTERNATIONAL), eq(NumberingPlanIndicator.INTERNET), eq("1919"),
                eq(new ESMClass()), eq((byte) 1), eq((byte) 2), eq("-300101001831100+"), eq("-300101003702200+"),
                eq(new RegisteredDelivery(SMSCDeliveryReceipt.FAILURE)),
                eq(ReplaceIfPresentFlag.REPLACE.value()), eq(DataCodings.newInstance((byte) 0)), eq((byte) 0),
                eq("short message body".getBytes())))
                .thenReturn(new SubmitSmResult(new MessageId("1"), null));

        command.execute(exchange);

        assertEquals(Collections.singletonList("1"), exchange.getMessage().getHeader(SmppConstants.ID));
        assertEquals(1, exchange.getMessage().getHeader(SmppConstants.SENT_MESSAGE_COUNT));
    }

    @Test
    public void executeWithOptionalParameter() throws Exception {
        Exchange exchange = new DefaultExchange(new DefaultCamelContext(), ExchangePattern.InOut);
        exchange.getIn().setHeader(SmppConstants.COMMAND, "SubmitSm");
        exchange.getIn().setHeader(SmppConstants.ID, "1");
        exchange.getIn().setHeader(SmppConstants.SOURCE_ADDR_TON, TypeOfNumber.NATIONAL.value());
        exchange.getIn().setHeader(SmppConstants.SOURCE_ADDR_NPI, NumberingPlanIndicator.NATIONAL.value());
        exchange.getIn().setHeader(SmppConstants.SOURCE_ADDR, "1818");
        exchange.getIn().setHeader(SmppConstants.DEST_ADDR_TON, TypeOfNumber.INTERNATIONAL.value());
        exchange.getIn().setHeader(SmppConstants.DEST_ADDR_NPI, NumberingPlanIndicator.INTERNET.value());
        exchange.getIn().setHeader(SmppConstants.DEST_ADDR, "1919");
        exchange.getIn().setHeader(SmppConstants.SCHEDULE_DELIVERY_TIME, new Date(1111111));
        exchange.getIn().setHeader(SmppConstants.VALIDITY_PERIOD, new Date(2222222));
        exchange.getIn().setHeader(SmppConstants.PROTOCOL_ID, (byte) 1);
        exchange.getIn().setHeader(SmppConstants.PRIORITY_FLAG, (byte) 2);
        exchange.getIn().setHeader(SmppConstants.REGISTERED_DELIVERY,
                new RegisteredDelivery(SMSCDeliveryReceipt.FAILURE).value());
        exchange.getIn().setHeader(SmppConstants.REPLACE_IF_PRESENT_FLAG, ReplaceIfPresentFlag.REPLACE.value());
        exchange.getIn().setBody("short message body");
        Map<String, String> optionalParameters = new LinkedHashMap<>();
        optionalParameters.put("SOURCE_SUBADDRESS", "1292");
        optionalParameters.put("ADDITIONAL_STATUS_INFO_TEXT", "urgent");
        optionalParameters.put("DEST_ADDR_SUBUNIT", "4");
        optionalParameters.put("DEST_TELEMATICS_ID", "2");
        optionalParameters.put("QOS_TIME_TO_LIVE", "3600000");
        optionalParameters.put("ALERT_ON_MESSAGE_DELIVERY", null);
        exchange.getIn().setHeader(SmppConstants.OPTIONAL_PARAMETERS, optionalParameters);
        when(session.submitShortMessage(eq("CMT"), eq(TypeOfNumber.NATIONAL), eq(NumberingPlanIndicator.NATIONAL), eq("1818"),
                eq(TypeOfNumber.INTERNATIONAL), eq(NumberingPlanIndicator.INTERNET), eq("1919"),
                eq(new ESMClass()), eq((byte) 1), eq((byte) 2), eq("-300101001831100+"), eq("-300101003702200+"),
                eq(new RegisteredDelivery(SMSCDeliveryReceipt.FAILURE)),
                eq(ReplaceIfPresentFlag.REPLACE.value()), eq(DataCodings.newInstance((byte) 0)), eq((byte) 0),
                eq("short message body".getBytes()), eq(new OptionalParameter.Source_subaddress("1292".getBytes())),
                eq(new OptionalParameter.Additional_status_info_text("urgent".getBytes())),
                eq(new OptionalParameter.Dest_addr_subunit((byte) 4)),
                eq(new OptionalParameter.Dest_telematics_id((short) 2)), eq(new OptionalParameter.Qos_time_to_live(3600000)),
                eq(new OptionalParameter.Alert_on_message_delivery((byte) 0))))
                .thenReturn(new SubmitSmResult(new MessageId("1"), null));

        command.execute(exchange);

        assertEquals(Collections.singletonList("1"), exchange.getMessage().getHeader(SmppConstants.ID));
        assertEquals(1, exchange.getMessage().getHeader(SmppConstants.SENT_MESSAGE_COUNT));
    }

    @Test
    public void executeWithOptionalParameterNewStyle() throws Exception {
        Exchange exchange = new DefaultExchange(new DefaultCamelContext(), ExchangePattern.InOut);
        exchange.getIn().setHeader(SmppConstants.COMMAND, "SubmitSm");
        exchange.getIn().setHeader(SmppConstants.ID, "1");
        exchange.getIn().setHeader(SmppConstants.SOURCE_ADDR_TON, TypeOfNumber.NATIONAL.value());
        exchange.getIn().setHeader(SmppConstants.SOURCE_ADDR_NPI, NumberingPlanIndicator.NATIONAL.value());
        exchange.getIn().setHeader(SmppConstants.SOURCE_ADDR, "1818");
        exchange.getIn().setHeader(SmppConstants.DEST_ADDR_TON, TypeOfNumber.INTERNATIONAL.value());
        exchange.getIn().setHeader(SmppConstants.DEST_ADDR_NPI, NumberingPlanIndicator.INTERNET.value());
        exchange.getIn().setHeader(SmppConstants.DEST_ADDR, "1919");
        exchange.getIn().setHeader(SmppConstants.SCHEDULE_DELIVERY_TIME, new Date(1111111));
        exchange.getIn().setHeader(SmppConstants.VALIDITY_PERIOD, new Date(2222222));
        exchange.getIn().setHeader(SmppConstants.PROTOCOL_ID, (byte) 1);
        exchange.getIn().setHeader(SmppConstants.PRIORITY_FLAG, (byte) 2);
        exchange.getIn().setHeader(SmppConstants.REGISTERED_DELIVERY,
                new RegisteredDelivery(SMSCDeliveryReceipt.FAILURE).value());
        exchange.getIn().setHeader(SmppConstants.REPLACE_IF_PRESENT_FLAG, ReplaceIfPresentFlag.REPLACE.value());
        exchange.getIn().setBody("short message body");
        Map<Short, Object> optionalParameters = new LinkedHashMap<>();
        // standard optional parameter
        optionalParameters.put((short) 0x0202, "1292".getBytes("UTF-8"));
        optionalParameters.put((short) 0x001D, "urgent");
        optionalParameters.put((short) 0x0005, Byte.valueOf("4"));
        optionalParameters.put((short) 0x0008, (short) 2);
        optionalParameters.put((short) 0x0017, 3600000);
        optionalParameters.put((short) 0x130C, null);
        // vendor specific optional parameter
        optionalParameters.put((short) 0x2150, "0815".getBytes("UTF-8"));
        optionalParameters.put((short) 0x2151, "0816");
        optionalParameters.put((short) 0x2152, Byte.valueOf("6"));
        optionalParameters.put((short) 0x2153, (short) 9);
        optionalParameters.put((short) 0x2154, 7400000);
        optionalParameters.put((short) 0x2155, null);
        exchange.getIn().setHeader(SmppConstants.OPTIONAL_PARAMETER, optionalParameters);
        when(session.submitShortMessage(eq("CMT"), eq(TypeOfNumber.NATIONAL), eq(NumberingPlanIndicator.NATIONAL), eq("1818"),
                eq(TypeOfNumber.INTERNATIONAL), eq(NumberingPlanIndicator.INTERNET), eq("1919"),
                eq(new ESMClass()), eq((byte) 1), eq((byte) 2), eq("-300101001831100+"), eq("-300101003702200+"),
                eq(new RegisteredDelivery(SMSCDeliveryReceipt.FAILURE)),
                eq(ReplaceIfPresentFlag.REPLACE.value()), eq(DataCodings.newInstance((byte) 0)), eq((byte) 0),
                eq("short message body".getBytes()),
                eq(new OptionalParameter.OctetString(Tag.SOURCE_SUBADDRESS, "1292")),
                eq(new OptionalParameter.COctetString(Tag.ADDITIONAL_STATUS_INFO_TEXT.code(), "urgent")),
                eq(new OptionalParameter.Byte(Tag.DEST_ADDR_SUBUNIT, (byte) 4)),
                eq(new OptionalParameter.Short(Tag.DEST_TELEMATICS_ID.code(), (short) 2)),
                eq(new OptionalParameter.Int(Tag.QOS_TIME_TO_LIVE, 3600000)),
                eq(new OptionalParameter.Null(Tag.ALERT_ON_MESSAGE_DELIVERY)),
                eq(new OptionalParameter.OctetString((short) 0x2150, "1292", "UTF-8")),
                eq(new OptionalParameter.COctetString((short) 0x2151, "0816")),
                eq(new OptionalParameter.Byte((short) 0x2152, (byte) 6)),
                eq(new OptionalParameter.Short((short) 0x2153, (short) 9)),
                eq(new OptionalParameter.Int((short) 0x2154, 7400000)),
                eq(new OptionalParameter.Null((short) 0x2155))))
                .thenReturn(new SubmitSmResult(new MessageId("1"), null));

        command.execute(exchange);

        assertEquals(Collections.singletonList("1"), exchange.getMessage().getHeader(SmppConstants.ID));
        assertEquals(1, exchange.getMessage().getHeader(SmppConstants.SENT_MESSAGE_COUNT));
    }

    @Test
    public void executeWithValidityPeriodAsString() throws Exception {
        Exchange exchange = new DefaultExchange(new DefaultCamelContext(), ExchangePattern.InOut);
        exchange.getIn().setHeader(SmppConstants.COMMAND, "SubmitSm");
        exchange.getIn().setHeader(SmppConstants.ID, "1");
        exchange.getIn().setHeader(SmppConstants.SOURCE_ADDR_TON, TypeOfNumber.NATIONAL.value());
        exchange.getIn().setHeader(SmppConstants.SOURCE_ADDR_NPI, NumberingPlanIndicator.NATIONAL.value());
        exchange.getIn().setHeader(SmppConstants.SOURCE_ADDR, "1818");
        exchange.getIn().setHeader(SmppConstants.DEST_ADDR_TON, TypeOfNumber.INTERNATIONAL.value());
        exchange.getIn().setHeader(SmppConstants.DEST_ADDR_NPI, NumberingPlanIndicator.INTERNET.value());
        exchange.getIn().setHeader(SmppConstants.DEST_ADDR, "1919");
        exchange.getIn().setHeader(SmppConstants.SCHEDULE_DELIVERY_TIME, new Date(1111111));
        exchange.getIn().setHeader(SmppConstants.VALIDITY_PERIOD, "000003000000000R"); // three days
        exchange.getIn().setHeader(SmppConstants.PROTOCOL_ID, (byte) 1);
        exchange.getIn().setHeader(SmppConstants.PRIORITY_FLAG, (byte) 2);
        exchange.getIn().setHeader(SmppConstants.REGISTERED_DELIVERY,
                new RegisteredDelivery(SMSCDeliveryReceipt.FAILURE).value());
        exchange.getIn().setHeader(SmppConstants.REPLACE_IF_PRESENT_FLAG, ReplaceIfPresentFlag.REPLACE.value());
        exchange.getIn().setBody("short message body");
        when(session.submitShortMessage(eq("CMT"), eq(TypeOfNumber.NATIONAL), eq(NumberingPlanIndicator.NATIONAL), eq("1818"),
                eq(TypeOfNumber.INTERNATIONAL), eq(NumberingPlanIndicator.INTERNET), eq("1919"),
                eq(new ESMClass()), eq((byte) 1), eq((byte) 2), eq("-300101001831100+"), eq("000003000000000R"),
                eq(new RegisteredDelivery(SMSCDeliveryReceipt.FAILURE)),
                eq(ReplaceIfPresentFlag.REPLACE.value()), eq(DataCodings.newInstance((byte) 0)), eq((byte) 0),
                eq("short message body".getBytes())))
                .thenReturn(new SubmitSmResult(new MessageId("1"), null));

        command.execute(exchange);

        assertEquals(Arrays.asList("1"), exchange.getMessage().getHeader(SmppConstants.ID));
        assertEquals(1, exchange.getMessage().getHeader(SmppConstants.SENT_MESSAGE_COUNT));
    }

    @Test
    public void alphabetUpdatesDataCoding() throws Exception {
        final byte incorrectDataCoding = (byte) 0x00;
        byte[] body = { 'A', 'B', 'C' };

        Exchange exchange = new DefaultExchange(new DefaultCamelContext(), ExchangePattern.InOut);
        exchange.getIn().setHeader(SmppConstants.COMMAND, "SubmitSm");
        exchange.getIn().setHeader(SmppConstants.ALPHABET, Alphabet.ALPHA_8_BIT.value());
        exchange.getIn().setBody(body);
        when(session.submitShortMessage(eq("CMT"), eq(TypeOfNumber.UNKNOWN), eq(NumberingPlanIndicator.UNKNOWN), eq("1616"),
                eq(TypeOfNumber.UNKNOWN), eq(NumberingPlanIndicator.UNKNOWN),
                eq("1717"), eq(new ESMClass()), eq((byte) 0), eq((byte) 1), (String) isNull(), (String) isNull(),
                eq(new RegisteredDelivery(SMSCDeliveryReceipt.SUCCESS_FAILURE)),
                eq(ReplaceIfPresentFlag.DEFAULT.value()), argThat(not(DataCodings.newInstance(incorrectDataCoding))),
                eq((byte) 0), eq(body)))
                .thenReturn(new SubmitSmResult(new MessageId("1"), null));

        command.execute(exchange);

        assertEquals(Arrays.asList("1"), exchange.getMessage().getHeader(SmppConstants.ID));
    }

    @Test
    public void bodyWithSmscDefaultDataCodingNarrowedToCharset() throws Exception {
        final byte dataCoding = (byte) 0x00; /* SMSC-default */
        byte[] body = { (byte) 0xFF, 'A', 'B', (byte) 0x00, (byte) 0xFF, (byte) 0x7F, 'C', (byte) 0xFF };
        byte[] bodyNarrowed = { '?', 'A', 'B', '\0', '?', (byte) 0x7F, 'C', '?' };

        Exchange exchange = new DefaultExchange(new DefaultCamelContext(), ExchangePattern.InOut);
        exchange.getIn().setHeader(SmppConstants.COMMAND, "SubmitSm");
        exchange.getIn().setHeader(SmppConstants.DATA_CODING, dataCoding);
        exchange.getIn().setBody(body);
        when(session.submitShortMessage(eq("CMT"),
                eq(TypeOfNumber.UNKNOWN),
                eq(NumberingPlanIndicator.UNKNOWN),
                eq("1616"),
                eq(TypeOfNumber.UNKNOWN),
                eq(NumberingPlanIndicator.UNKNOWN),
                eq("1717"),
                eq(new ESMClass()),
                eq((byte) 0),
                eq((byte) 1),
                (String) isNull(),
                (String) isNull(),
                eq(new RegisteredDelivery(SMSCDeliveryReceipt.SUCCESS_FAILURE)),
                eq(ReplaceIfPresentFlag.DEFAULT.value()),
                eq(DataCodings.newInstance(dataCoding)),
                eq((byte) 0),
                eq(bodyNarrowed)))
                .thenReturn(new SubmitSmResult(new MessageId("1"), null));

        command.execute(exchange);

        assertEquals(Arrays.asList("1"), exchange.getMessage().getHeader(SmppConstants.ID));
    }

    @Test
    public void bodyWithLatin1DataCodingNarrowedToCharset() throws Exception {
        final byte dataCoding = (byte) 0x03; /* ISO-8859-1 (Latin1) */
        byte[] body = { (byte) 0xFF, 'A', 'B', (byte) 0x00, (byte) 0xFF, (byte) 0x7F, 'C', (byte) 0xFF };
        byte[] bodyNarrowed = { '?', 'A', 'B', '\0', '?', (byte) 0x7F, 'C', '?' };

        Exchange exchange = new DefaultExchange(new DefaultCamelContext(), ExchangePattern.InOut);
        exchange.getIn().setHeader(SmppConstants.COMMAND, "SubmitSm");
        exchange.getIn().setHeader(SmppConstants.DATA_CODING, dataCoding);
        exchange.getIn().setBody(body);
        when(session.submitShortMessage(eq("CMT"),
                eq(TypeOfNumber.UNKNOWN),
                eq(NumberingPlanIndicator.UNKNOWN),
                eq("1616"),
                eq(TypeOfNumber.UNKNOWN),
                eq(NumberingPlanIndicator.UNKNOWN),
                eq("1717"),
                eq(new ESMClass()),
                eq((byte) 0),
                eq((byte) 1),
                (String) isNull(),
                (String) isNull(),
                eq(new RegisteredDelivery(SMSCDeliveryReceipt.SUCCESS_FAILURE)),
                eq(ReplaceIfPresentFlag.DEFAULT.value()),
                eq(DataCodings.newInstance(dataCoding)),
                eq((byte) 0),
                eq(bodyNarrowed)))
                .thenReturn(new SubmitSmResult(new MessageId("1"), null));

        command.execute(exchange);

        assertEquals(Collections.singletonList("1"), exchange.getMessage().getHeader(SmppConstants.ID));
    }

    @Test
    public void bodyWithSMPP8bitDataCodingNotModified() throws Exception {
        final byte dataCoding = (byte) 0x04; /* SMPP 8-bit */
        byte[] body = { (byte) 0xFF, 'A', 'B', (byte) 0x00, (byte) 0xFF, (byte) 0x7F, 'C', (byte) 0xFF };

        Exchange exchange = new DefaultExchange(new DefaultCamelContext(), ExchangePattern.InOut);
        exchange.getIn().setHeader(SmppConstants.COMMAND, "SubmitSm");
        exchange.getIn().setHeader(SmppConstants.DATA_CODING, dataCoding);
        exchange.getIn().setBody(body);
        when(session.submitShortMessage(eq("CMT"),
                eq(TypeOfNumber.UNKNOWN),
                eq(NumberingPlanIndicator.UNKNOWN),
                eq("1616"),
                eq(TypeOfNumber.UNKNOWN),
                eq(NumberingPlanIndicator.UNKNOWN),
                eq("1717"),
                eq(new ESMClass()),
                eq((byte) 0),
                eq((byte) 1),
                (String) isNull(),
                (String) isNull(),
                eq(new RegisteredDelivery(SMSCDeliveryReceipt.SUCCESS_FAILURE)),
                eq(ReplaceIfPresentFlag.DEFAULT.value()),
                eq(DataCodings.newInstance(dataCoding)),
                eq((byte) 0),
                eq(body)))
                .thenReturn(new SubmitSmResult(new MessageId("1"), null));

        command.execute(exchange);

        assertEquals(Collections.singletonList("1"), exchange.getMessage().getHeader(SmppConstants.ID));
    }

    @Test
    public void bodyWithGSM8bitDataCodingNotModified() throws Exception {
        final byte dataCoding = (byte) 0xF7; /* GSM 8-bit class 3 */
        byte[] body = { (byte) 0xFF, 'A', 'B', (byte) 0x00, (byte) 0xFF, (byte) 0x7F, 'C', (byte) 0xFF };

        Exchange exchange = new DefaultExchange(new DefaultCamelContext(), ExchangePattern.InOut);
        exchange.getIn().setHeader(SmppConstants.COMMAND, "SubmitSm");
        exchange.getIn().setHeader(SmppConstants.DATA_CODING, dataCoding);
        exchange.getIn().setBody(body);
        when(session.submitShortMessage(eq("CMT"),
                eq(TypeOfNumber.UNKNOWN),
                eq(NumberingPlanIndicator.UNKNOWN),
                eq("1616"),
                eq(TypeOfNumber.UNKNOWN),
                eq(NumberingPlanIndicator.UNKNOWN),
                eq("1717"),
                eq(new ESMClass()),
                eq((byte) 0),
                eq((byte) 1),
                (String) isNull(),
                (String) isNull(),
                eq(new RegisteredDelivery(SMSCDeliveryReceipt.SUCCESS_FAILURE)),
                eq(ReplaceIfPresentFlag.DEFAULT.value()),
                eq(DataCodings.newInstance(dataCoding)),
                eq((byte) 0),
                eq(body)))
                .thenReturn(new SubmitSmResult(new MessageId("1"), null));

        command.execute(exchange);

        assertEquals(Collections.singletonList("1"), exchange.getMessage().getHeader(SmppConstants.ID));
    }

    @Test
    public void eightBitDataCodingOverridesDefaultAlphabet() throws Exception {
        final byte binDataCoding = (byte) 0x04; /* SMPP 8-bit */
        byte[] body = { (byte) 0xFF, 'A', 'B', (byte) 0x00, (byte) 0xFF, (byte) 0x7F, 'C', (byte) 0xFF };

        Exchange exchange = new DefaultExchange(new DefaultCamelContext(), ExchangePattern.InOut);
        exchange.getIn().setHeader(SmppConstants.COMMAND, "SubmitSm");
        exchange.getIn().setHeader(SmppConstants.ALPHABET, Alphabet.ALPHA_DEFAULT.value());
        exchange.getIn().setHeader(SmppConstants.DATA_CODING, binDataCoding);
        exchange.getIn().setBody(body);
        when(session.submitShortMessage(eq("CMT"),
                eq(TypeOfNumber.UNKNOWN),
                eq(NumberingPlanIndicator.UNKNOWN),
                eq("1616"),
                eq(TypeOfNumber.UNKNOWN),
                eq(NumberingPlanIndicator.UNKNOWN),
                eq("1717"),
                eq(new ESMClass()),
                eq((byte) 0),
                eq((byte) 1),
                (String) isNull(),
                (String) isNull(),
                eq(new RegisteredDelivery(SMSCDeliveryReceipt.SUCCESS_FAILURE)),
                eq(ReplaceIfPresentFlag.DEFAULT.value()),
                eq(DataCodings.newInstance(binDataCoding)),
                eq((byte) 0),
                eq(body)))
                .thenReturn(new SubmitSmResult(new MessageId("1"), null));

        command.execute(exchange);

        assertEquals(Collections.singletonList("1"), exchange.getMessage().getHeader(SmppConstants.ID));
    }

    @Test
    public void latin1DataCodingOverridesEightBitAlphabet() throws Exception {
        final byte latin1DataCoding = (byte) 0x03; /* ISO-8859-1 (Latin1) */
        byte[] body = { (byte) 0xFF, 'A', 'B', (byte) 0x00, (byte) 0xFF, (byte) 0x7F, 'C', (byte) 0xFF };
        byte[] bodyNarrowed = { '?', 'A', 'B', '\0', '?', (byte) 0x7F, 'C', '?' };

        Exchange exchange = new DefaultExchange(new DefaultCamelContext(), ExchangePattern.InOut);
        exchange.getIn().setHeader(SmppConstants.COMMAND, "SubmitSm");
        exchange.getIn().setHeader(SmppConstants.ALPHABET, Alphabet.ALPHA_8_BIT.value());
        exchange.getIn().setHeader(SmppConstants.DATA_CODING, latin1DataCoding);
        exchange.getIn().setBody(body);
        when(session.submitShortMessage(eq("CMT"),
                eq(TypeOfNumber.UNKNOWN),
                eq(NumberingPlanIndicator.UNKNOWN),
                eq("1616"),
                eq(TypeOfNumber.UNKNOWN),
                eq(NumberingPlanIndicator.UNKNOWN),
                eq("1717"),
                eq(new ESMClass()),
                eq((byte) 0),
                eq((byte) 1),
                (String) isNull(),
                (String) isNull(),
                eq(new RegisteredDelivery(SMSCDeliveryReceipt.SUCCESS_FAILURE)),
                eq(ReplaceIfPresentFlag.DEFAULT.value()),
                eq(DataCodings.newInstance(latin1DataCoding)),
                eq((byte) 0),
                eq(bodyNarrowed)))
                .thenReturn(new SubmitSmResult(new MessageId("1"), null));

        command.execute(exchange);

        assertEquals(Collections.singletonList("1"), exchange.getMessage().getHeader(SmppConstants.ID));
    }

    @Test
    public void singleDlrRequestOverridesDeliveryReceiptFlag() throws Exception {
        String longSms = "123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890" +
                         "12345678901234567890123456789012345678901234567890123456789012345678901";

        Exchange exchange = new DefaultExchange(new DefaultCamelContext(), ExchangePattern.InOut);
        exchange.getIn().setHeader(SmppConstants.COMMAND, "SubmitSm");
        exchange.getIn().setHeader(SmppConstants.SINGLE_DLR, "true");
        exchange.getIn().setBody(longSms.getBytes());

        when(session.submitShortMessage(eq("CMT"),
                eq(TypeOfNumber.UNKNOWN), eq(NumberingPlanIndicator.UNKNOWN), eq("1616"),
                eq(TypeOfNumber.UNKNOWN), eq(NumberingPlanIndicator.UNKNOWN), eq("1717"),
                eq(new ESMClass((byte) 64)), eq((byte) 0), eq((byte) 1),
                (String) isNull(), (String) isNull(), eq(new RegisteredDelivery(SMSCDeliveryReceipt.DEFAULT)),
                eq(ReplaceIfPresentFlag.DEFAULT.value()),
                eq(DataCodings.newInstance((byte) 0)), eq((byte) 0), any(byte[].class)))
                .thenReturn(new SubmitSmResult(new MessageId("1"), null));

        when(session.submitShortMessage(eq("CMT"),
                eq(TypeOfNumber.UNKNOWN), eq(NumberingPlanIndicator.UNKNOWN), eq("1616"),
                eq(TypeOfNumber.UNKNOWN), eq(NumberingPlanIndicator.UNKNOWN), eq("1717"),
                eq(new ESMClass((byte) 64)), eq((byte) 0), eq((byte) 1),
                (String) isNull(), (String) isNull(), eq(new RegisteredDelivery(SMSCDeliveryReceipt.SUCCESS_FAILURE)),
                eq(ReplaceIfPresentFlag.DEFAULT.value()),
                eq(DataCodings.newInstance((byte) 0)), eq((byte) 0), any(byte[].class)))
                .thenReturn(new SubmitSmResult(new MessageId("2"), null));

        command.execute(exchange);
        assertEquals(Arrays.asList("1", "2"), exchange.getMessage().getHeader(SmppConstants.ID));
        assertEquals(2, exchange.getMessage().getHeader(SmppConstants.SENT_MESSAGE_COUNT));
    }
}

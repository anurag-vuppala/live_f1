/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.netty.http;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.netty.http.NettyHttpConfiguration;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class NettyHttpConfigurationConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.component.netty.http.NettyHttpConfiguration target = (org.apache.camel.component.netty.http.NettyHttpConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowdefaultcodec":
        case "AllowDefaultCodec": target.setAllowDefaultCodec(property(camelContext, boolean.class, value)); return true;
        case "allowserializedheaders":
        case "AllowSerializedHeaders": target.setAllowSerializedHeaders(property(camelContext, boolean.class, value)); return true;
        case "autoappenddelimiter":
        case "AutoAppendDelimiter": target.setAutoAppendDelimiter(property(camelContext, boolean.class, value)); return true;
        case "backlog":
        case "Backlog": target.setBacklog(property(camelContext, int.class, value)); return true;
        case "bosscount":
        case "BossCount": target.setBossCount(property(camelContext, int.class, value)); return true;
        case "bossgroup":
        case "BossGroup": target.setBossGroup(property(camelContext, io.netty.channel.EventLoopGroup.class, value)); return true;
        case "bridgeendpoint":
        case "BridgeEndpoint": target.setBridgeEndpoint(property(camelContext, boolean.class, value)); return true;
        case "broadcast":
        case "Broadcast": target.setBroadcast(property(camelContext, boolean.class, value)); return true;
        case "channelgroup":
        case "ChannelGroup": target.setChannelGroup(property(camelContext, io.netty.channel.group.ChannelGroup.class, value)); return true;
        case "chunkedmaxcontentlength":
        case "ChunkedMaxContentLength": target.setChunkedMaxContentLength(property(camelContext, int.class, value)); return true;
        case "clientinitializerfactory":
        case "ClientInitializerFactory": target.setClientInitializerFactory(property(camelContext, org.apache.camel.component.netty.ClientInitializerFactory.class, value)); return true;
        case "clientmode":
        case "ClientMode": target.setClientMode(property(camelContext, boolean.class, value)); return true;
        case "clientpipelinefactory":
        case "ClientPipelineFactory": target.setClientPipelineFactory(property(camelContext, org.apache.camel.component.netty.ClientInitializerFactory.class, value)); return true;
        case "compression":
        case "Compression": target.setCompression(property(camelContext, boolean.class, value)); return true;
        case "connecttimeout":
        case "ConnectTimeout": target.setConnectTimeout(property(camelContext, int.class, value)); return true;
        case "correlationmanager":
        case "CorrelationManager": target.setCorrelationManager(property(camelContext, org.apache.camel.component.netty.NettyCamelStateCorrelationManager.class, value)); return true;
        case "decodermaxlinelength":
        case "DecoderMaxLineLength": target.setDecoderMaxLineLength(property(camelContext, int.class, value)); return true;
        case "decoders":
        case "Decoders": target.setDecoders(property(camelContext, java.lang.String.class, value)); return true;
        case "decodersaslist":
        case "DecodersAsList": target.setDecodersAsList(property(camelContext, java.util.List.class, value)); return true;
        case "delimiter":
        case "Delimiter": target.setDelimiter(property(camelContext, org.apache.camel.component.netty.TextLineDelimiter.class, value)); return true;
        case "disablestreamcache":
        case "DisableStreamCache": target.setDisableStreamCache(property(camelContext, boolean.class, value)); return true;
        case "disconnect":
        case "Disconnect": target.setDisconnect(property(camelContext, boolean.class, value)); return true;
        case "disconnectonnoreply":
        case "DisconnectOnNoReply": target.setDisconnectOnNoReply(property(camelContext, boolean.class, value)); return true;
        case "enabledprotocols":
        case "EnabledProtocols": target.setEnabledProtocols(property(camelContext, java.lang.String.class, value)); return true;
        case "encoders":
        case "Encoders": target.setEncoders(property(camelContext, java.lang.String.class, value)); return true;
        case "encodersaslist":
        case "EncodersAsList": target.setEncodersAsList(property(camelContext, java.util.List.class, value)); return true;
        case "encoding":
        case "Encoding": target.setEncoding(property(camelContext, java.lang.String.class, value)); return true;
        case "host":
        case "Host": target.setHost(property(camelContext, java.lang.String.class, value)); return true;
        case "hostnameverification":
        case "HostnameVerification": target.setHostnameVerification(property(camelContext, boolean.class, value)); return true;
        case "keepalive":
        case "KeepAlive": target.setKeepAlive(property(camelContext, boolean.class, value)); return true;
        case "keystorefile":
        case "KeyStoreFile": target.setKeyStoreFile(property(camelContext, java.io.File.class, value)); return true;
        case "keystoreformat":
        case "KeyStoreFormat": target.setKeyStoreFormat(property(camelContext, java.lang.String.class, value)); return true;
        case "keystoreresource":
        case "KeyStoreResource": target.setKeyStoreResource(property(camelContext, java.lang.String.class, value)); return true;
        case "lazychannelcreation":
        case "LazyChannelCreation": target.setLazyChannelCreation(property(camelContext, boolean.class, value)); return true;
        case "logwarnonbadrequest":
        case "LogWarnOnBadRequest": target.setLogWarnOnBadRequest(property(camelContext, boolean.class, value)); return true;
        case "mapheaders":
        case "MapHeaders": target.setMapHeaders(property(camelContext, boolean.class, value)); return true;
        case "matchonuriprefix":
        case "MatchOnUriPrefix": target.setMatchOnUriPrefix(property(camelContext, boolean.class, value)); return true;
        case "maxchunksize":
        case "MaxChunkSize": target.setMaxChunkSize(property(camelContext, int.class, value)); return true;
        case "maxheadersize":
        case "MaxHeaderSize": target.setMaxHeaderSize(property(camelContext, int.class, value)); return true;
        case "maxinitiallinelength":
        case "MaxInitialLineLength": target.setMaxInitialLineLength(property(camelContext, int.class, value)); return true;
        case "muteexception":
        case "MuteException": target.setMuteException(property(camelContext, boolean.class, value)); return true;
        case "nativetransport":
        case "NativeTransport": target.setNativeTransport(property(camelContext, boolean.class, value)); return true;
        case "needclientauth":
        case "NeedClientAuth": target.setNeedClientAuth(property(camelContext, boolean.class, value)); return true;
        case "nettyserverbootstrapfactory":
        case "NettyServerBootstrapFactory": target.setNettyServerBootstrapFactory(property(camelContext, org.apache.camel.component.netty.NettyServerBootstrapFactory.class, value)); return true;
        case "networkinterface":
        case "NetworkInterface": target.setNetworkInterface(property(camelContext, java.lang.String.class, value)); return true;
        case "noreplyloglevel":
        case "NoReplyLogLevel": target.setNoReplyLogLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "okstatuscoderange":
        case "OkStatusCodeRange": target.setOkStatusCodeRange(property(camelContext, java.lang.String.class, value)); return true;
        case "options":
        case "Options": target.setOptions(property(camelContext, java.util.Map.class, value)); return true;
        case "passphrase":
        case "Passphrase": target.setPassphrase(property(camelContext, java.lang.String.class, value)); return true;
        case "path":
        case "Path": target.setPath(property(camelContext, java.lang.String.class, value)); return true;
        case "port":
        case "Port": target.setPort(property(camelContext, int.class, value)); return true;
        case "producerpoolblockwhenexhausted":
        case "ProducerPoolBlockWhenExhausted": target.setProducerPoolBlockWhenExhausted(property(camelContext, boolean.class, value)); return true;
        case "producerpoolenabled":
        case "ProducerPoolEnabled": target.setProducerPoolEnabled(property(camelContext, boolean.class, value)); return true;
        case "producerpoolmaxidle":
        case "ProducerPoolMaxIdle": target.setProducerPoolMaxIdle(property(camelContext, int.class, value)); return true;
        case "producerpoolmaxtotal":
        case "ProducerPoolMaxTotal": target.setProducerPoolMaxTotal(property(camelContext, int.class, value)); return true;
        case "producerpoolmaxwait":
        case "ProducerPoolMaxWait": target.setProducerPoolMaxWait(property(camelContext, long.class, value)); return true;
        case "producerpoolminevictableidle":
        case "ProducerPoolMinEvictableIdle": target.setProducerPoolMinEvictableIdle(property(camelContext, long.class, value)); return true;
        case "producerpoolminidle":
        case "ProducerPoolMinIdle": target.setProducerPoolMinIdle(property(camelContext, int.class, value)); return true;
        case "protocol":
        case "Protocol": target.setProtocol(property(camelContext, java.lang.String.class, value)); return true;
        case "receivebuffersize":
        case "ReceiveBufferSize": target.setReceiveBufferSize(property(camelContext, int.class, value)); return true;
        case "receivebuffersizepredictor":
        case "ReceiveBufferSizePredictor": target.setReceiveBufferSizePredictor(property(camelContext, int.class, value)); return true;
        case "reconnect":
        case "Reconnect": target.setReconnect(property(camelContext, boolean.class, value)); return true;
        case "reconnectinterval":
        case "ReconnectInterval": target.setReconnectInterval(property(camelContext, int.class, value)); return true;
        case "requesttimeout":
        case "RequestTimeout": target.setRequestTimeout(property(camelContext, long.class, value)); return true;
        case "reuseaddress":
        case "ReuseAddress": target.setReuseAddress(property(camelContext, boolean.class, value)); return true;
        case "reusechannel":
        case "ReuseChannel": target.setReuseChannel(property(camelContext, boolean.class, value)); return true;
        case "securityprovider":
        case "SecurityProvider": target.setSecurityProvider(property(camelContext, java.lang.String.class, value)); return true;
        case "send503whensuspended":
        case "Send503whenSuspended": target.setSend503whenSuspended(property(camelContext, boolean.class, value)); return true;
        case "sendbuffersize":
        case "SendBufferSize": target.setSendBufferSize(property(camelContext, int.class, value)); return true;
        case "serverclosedchannelexceptioncaughtloglevel":
        case "ServerClosedChannelExceptionCaughtLogLevel": target.setServerClosedChannelExceptionCaughtLogLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "serverexceptioncaughtloglevel":
        case "ServerExceptionCaughtLogLevel": target.setServerExceptionCaughtLogLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "serverinitializerfactory":
        case "ServerInitializerFactory": target.setServerInitializerFactory(property(camelContext, org.apache.camel.component.netty.ServerInitializerFactory.class, value)); return true;
        case "serverpipelinefactory":
        case "ServerPipelineFactory": target.setServerPipelineFactory(property(camelContext, org.apache.camel.component.netty.ServerInitializerFactory.class, value)); return true;
        case "ssl":
        case "Ssl": target.setSsl(property(camelContext, boolean.class, value)); return true;
        case "sslclientcertheaders":
        case "SslClientCertHeaders": target.setSslClientCertHeaders(property(camelContext, boolean.class, value)); return true;
        case "sslcontextparameters":
        case "SslContextParameters": target.setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "sslhandler":
        case "SslHandler": target.setSslHandler(property(camelContext, io.netty.handler.ssl.SslHandler.class, value)); return true;
        case "sync":
        case "Sync": target.setSync(property(camelContext, boolean.class, value)); return true;
        case "synchronous":
        case "Synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "tcpnodelay":
        case "TcpNoDelay": target.setTcpNoDelay(property(camelContext, boolean.class, value)); return true;
        case "textline":
        case "Textline": target.setTextline(property(camelContext, boolean.class, value)); return true;
        case "throwexceptiononfailure":
        case "ThrowExceptionOnFailure": target.setThrowExceptionOnFailure(property(camelContext, boolean.class, value)); return true;
        case "transferexception":
        case "TransferException": target.setTransferException(property(camelContext, boolean.class, value)); return true;
        case "transferexchange":
        case "TransferExchange": target.setTransferExchange(property(camelContext, boolean.class, value)); return true;
        case "truststorefile":
        case "TrustStoreFile": target.setTrustStoreFile(property(camelContext, java.io.File.class, value)); return true;
        case "truststoreresource":
        case "TrustStoreResource": target.setTrustStoreResource(property(camelContext, java.lang.String.class, value)); return true;
        case "udpbytearraycodec":
        case "UdpByteArrayCodec": target.setUdpByteArrayCodec(property(camelContext, boolean.class, value)); return true;
        case "udpconnectionlesssending":
        case "UdpConnectionlessSending": target.setUdpConnectionlessSending(property(camelContext, boolean.class, value)); return true;
        case "unixdomainsocketpath":
        case "UnixDomainSocketPath": target.setUnixDomainSocketPath(property(camelContext, java.lang.String.class, value)); return true;
        case "urldecodeheaders":
        case "UrlDecodeHeaders": target.setUrlDecodeHeaders(property(camelContext, boolean.class, value)); return true;
        case "usebytebuf":
        case "UseByteBuf": target.setUseByteBuf(property(camelContext, boolean.class, value)); return true;
        case "userelativepath":
        case "UseRelativePath": target.setUseRelativePath(property(camelContext, boolean.class, value)); return true;
        case "usingexecutorservice":
        case "UsingExecutorService": target.setUsingExecutorService(property(camelContext, boolean.class, value)); return true;
        case "workercount":
        case "WorkerCount": target.setWorkerCount(property(camelContext, int.class, value)); return true;
        case "workergroup":
        case "WorkerGroup": target.setWorkerGroup(property(camelContext, io.netty.channel.EventLoopGroup.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowdefaultcodec":
        case "AllowDefaultCodec": return boolean.class;
        case "allowserializedheaders":
        case "AllowSerializedHeaders": return boolean.class;
        case "autoappenddelimiter":
        case "AutoAppendDelimiter": return boolean.class;
        case "backlog":
        case "Backlog": return int.class;
        case "bosscount":
        case "BossCount": return int.class;
        case "bossgroup":
        case "BossGroup": return io.netty.channel.EventLoopGroup.class;
        case "bridgeendpoint":
        case "BridgeEndpoint": return boolean.class;
        case "broadcast":
        case "Broadcast": return boolean.class;
        case "channelgroup":
        case "ChannelGroup": return io.netty.channel.group.ChannelGroup.class;
        case "chunkedmaxcontentlength":
        case "ChunkedMaxContentLength": return int.class;
        case "clientinitializerfactory":
        case "ClientInitializerFactory": return org.apache.camel.component.netty.ClientInitializerFactory.class;
        case "clientmode":
        case "ClientMode": return boolean.class;
        case "clientpipelinefactory":
        case "ClientPipelineFactory": return org.apache.camel.component.netty.ClientInitializerFactory.class;
        case "compression":
        case "Compression": return boolean.class;
        case "connecttimeout":
        case "ConnectTimeout": return int.class;
        case "correlationmanager":
        case "CorrelationManager": return org.apache.camel.component.netty.NettyCamelStateCorrelationManager.class;
        case "decodermaxlinelength":
        case "DecoderMaxLineLength": return int.class;
        case "decoders":
        case "Decoders": return java.lang.String.class;
        case "decodersaslist":
        case "DecodersAsList": return java.util.List.class;
        case "delimiter":
        case "Delimiter": return org.apache.camel.component.netty.TextLineDelimiter.class;
        case "disablestreamcache":
        case "DisableStreamCache": return boolean.class;
        case "disconnect":
        case "Disconnect": return boolean.class;
        case "disconnectonnoreply":
        case "DisconnectOnNoReply": return boolean.class;
        case "enabledprotocols":
        case "EnabledProtocols": return java.lang.String.class;
        case "encoders":
        case "Encoders": return java.lang.String.class;
        case "encodersaslist":
        case "EncodersAsList": return java.util.List.class;
        case "encoding":
        case "Encoding": return java.lang.String.class;
        case "host":
        case "Host": return java.lang.String.class;
        case "hostnameverification":
        case "HostnameVerification": return boolean.class;
        case "keepalive":
        case "KeepAlive": return boolean.class;
        case "keystorefile":
        case "KeyStoreFile": return java.io.File.class;
        case "keystoreformat":
        case "KeyStoreFormat": return java.lang.String.class;
        case "keystoreresource":
        case "KeyStoreResource": return java.lang.String.class;
        case "lazychannelcreation":
        case "LazyChannelCreation": return boolean.class;
        case "logwarnonbadrequest":
        case "LogWarnOnBadRequest": return boolean.class;
        case "mapheaders":
        case "MapHeaders": return boolean.class;
        case "matchonuriprefix":
        case "MatchOnUriPrefix": return boolean.class;
        case "maxchunksize":
        case "MaxChunkSize": return int.class;
        case "maxheadersize":
        case "MaxHeaderSize": return int.class;
        case "maxinitiallinelength":
        case "MaxInitialLineLength": return int.class;
        case "muteexception":
        case "MuteException": return boolean.class;
        case "nativetransport":
        case "NativeTransport": return boolean.class;
        case "needclientauth":
        case "NeedClientAuth": return boolean.class;
        case "nettyserverbootstrapfactory":
        case "NettyServerBootstrapFactory": return org.apache.camel.component.netty.NettyServerBootstrapFactory.class;
        case "networkinterface":
        case "NetworkInterface": return java.lang.String.class;
        case "noreplyloglevel":
        case "NoReplyLogLevel": return org.apache.camel.LoggingLevel.class;
        case "okstatuscoderange":
        case "OkStatusCodeRange": return java.lang.String.class;
        case "options":
        case "Options": return java.util.Map.class;
        case "passphrase":
        case "Passphrase": return java.lang.String.class;
        case "path":
        case "Path": return java.lang.String.class;
        case "port":
        case "Port": return int.class;
        case "producerpoolblockwhenexhausted":
        case "ProducerPoolBlockWhenExhausted": return boolean.class;
        case "producerpoolenabled":
        case "ProducerPoolEnabled": return boolean.class;
        case "producerpoolmaxidle":
        case "ProducerPoolMaxIdle": return int.class;
        case "producerpoolmaxtotal":
        case "ProducerPoolMaxTotal": return int.class;
        case "producerpoolmaxwait":
        case "ProducerPoolMaxWait": return long.class;
        case "producerpoolminevictableidle":
        case "ProducerPoolMinEvictableIdle": return long.class;
        case "producerpoolminidle":
        case "ProducerPoolMinIdle": return int.class;
        case "protocol":
        case "Protocol": return java.lang.String.class;
        case "receivebuffersize":
        case "ReceiveBufferSize": return int.class;
        case "receivebuffersizepredictor":
        case "ReceiveBufferSizePredictor": return int.class;
        case "reconnect":
        case "Reconnect": return boolean.class;
        case "reconnectinterval":
        case "ReconnectInterval": return int.class;
        case "requesttimeout":
        case "RequestTimeout": return long.class;
        case "reuseaddress":
        case "ReuseAddress": return boolean.class;
        case "reusechannel":
        case "ReuseChannel": return boolean.class;
        case "securityprovider":
        case "SecurityProvider": return java.lang.String.class;
        case "send503whensuspended":
        case "Send503whenSuspended": return boolean.class;
        case "sendbuffersize":
        case "SendBufferSize": return int.class;
        case "serverclosedchannelexceptioncaughtloglevel":
        case "ServerClosedChannelExceptionCaughtLogLevel": return org.apache.camel.LoggingLevel.class;
        case "serverexceptioncaughtloglevel":
        case "ServerExceptionCaughtLogLevel": return org.apache.camel.LoggingLevel.class;
        case "serverinitializerfactory":
        case "ServerInitializerFactory": return org.apache.camel.component.netty.ServerInitializerFactory.class;
        case "serverpipelinefactory":
        case "ServerPipelineFactory": return org.apache.camel.component.netty.ServerInitializerFactory.class;
        case "ssl":
        case "Ssl": return boolean.class;
        case "sslclientcertheaders":
        case "SslClientCertHeaders": return boolean.class;
        case "sslcontextparameters":
        case "SslContextParameters": return org.apache.camel.support.jsse.SSLContextParameters.class;
        case "sslhandler":
        case "SslHandler": return io.netty.handler.ssl.SslHandler.class;
        case "sync":
        case "Sync": return boolean.class;
        case "synchronous":
        case "Synchronous": return boolean.class;
        case "tcpnodelay":
        case "TcpNoDelay": return boolean.class;
        case "textline":
        case "Textline": return boolean.class;
        case "throwexceptiononfailure":
        case "ThrowExceptionOnFailure": return boolean.class;
        case "transferexception":
        case "TransferException": return boolean.class;
        case "transferexchange":
        case "TransferExchange": return boolean.class;
        case "truststorefile":
        case "TrustStoreFile": return java.io.File.class;
        case "truststoreresource":
        case "TrustStoreResource": return java.lang.String.class;
        case "udpbytearraycodec":
        case "UdpByteArrayCodec": return boolean.class;
        case "udpconnectionlesssending":
        case "UdpConnectionlessSending": return boolean.class;
        case "unixdomainsocketpath":
        case "UnixDomainSocketPath": return java.lang.String.class;
        case "urldecodeheaders":
        case "UrlDecodeHeaders": return boolean.class;
        case "usebytebuf":
        case "UseByteBuf": return boolean.class;
        case "userelativepath":
        case "UseRelativePath": return boolean.class;
        case "usingexecutorservice":
        case "UsingExecutorService": return boolean.class;
        case "workercount":
        case "WorkerCount": return int.class;
        case "workergroup":
        case "WorkerGroup": return io.netty.channel.EventLoopGroup.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.component.netty.http.NettyHttpConfiguration target = (org.apache.camel.component.netty.http.NettyHttpConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowdefaultcodec":
        case "AllowDefaultCodec": return target.isAllowDefaultCodec();
        case "allowserializedheaders":
        case "AllowSerializedHeaders": return target.isAllowSerializedHeaders();
        case "autoappenddelimiter":
        case "AutoAppendDelimiter": return target.isAutoAppendDelimiter();
        case "backlog":
        case "Backlog": return target.getBacklog();
        case "bosscount":
        case "BossCount": return target.getBossCount();
        case "bossgroup":
        case "BossGroup": return target.getBossGroup();
        case "bridgeendpoint":
        case "BridgeEndpoint": return target.isBridgeEndpoint();
        case "broadcast":
        case "Broadcast": return target.isBroadcast();
        case "channelgroup":
        case "ChannelGroup": return target.getChannelGroup();
        case "chunkedmaxcontentlength":
        case "ChunkedMaxContentLength": return target.getChunkedMaxContentLength();
        case "clientinitializerfactory":
        case "ClientInitializerFactory": return target.getClientInitializerFactory();
        case "clientmode":
        case "ClientMode": return target.isClientMode();
        case "clientpipelinefactory":
        case "ClientPipelineFactory": return target.getClientPipelineFactory();
        case "compression":
        case "Compression": return target.isCompression();
        case "connecttimeout":
        case "ConnectTimeout": return target.getConnectTimeout();
        case "correlationmanager":
        case "CorrelationManager": return target.getCorrelationManager();
        case "decodermaxlinelength":
        case "DecoderMaxLineLength": return target.getDecoderMaxLineLength();
        case "decoders":
        case "Decoders": return target.getDecoders();
        case "decodersaslist":
        case "DecodersAsList": return target.getDecodersAsList();
        case "delimiter":
        case "Delimiter": return target.getDelimiter();
        case "disablestreamcache":
        case "DisableStreamCache": return target.isDisableStreamCache();
        case "disconnect":
        case "Disconnect": return target.isDisconnect();
        case "disconnectonnoreply":
        case "DisconnectOnNoReply": return target.isDisconnectOnNoReply();
        case "enabledprotocols":
        case "EnabledProtocols": return target.getEnabledProtocols();
        case "encoders":
        case "Encoders": return target.getEncoders();
        case "encodersaslist":
        case "EncodersAsList": return target.getEncodersAsList();
        case "encoding":
        case "Encoding": return target.getEncoding();
        case "host":
        case "Host": return target.getHost();
        case "hostnameverification":
        case "HostnameVerification": return target.isHostnameVerification();
        case "keepalive":
        case "KeepAlive": return target.isKeepAlive();
        case "keystorefile":
        case "KeyStoreFile": return target.getKeyStoreFile();
        case "keystoreformat":
        case "KeyStoreFormat": return target.getKeyStoreFormat();
        case "keystoreresource":
        case "KeyStoreResource": return target.getKeyStoreResource();
        case "lazychannelcreation":
        case "LazyChannelCreation": return target.isLazyChannelCreation();
        case "logwarnonbadrequest":
        case "LogWarnOnBadRequest": return target.isLogWarnOnBadRequest();
        case "mapheaders":
        case "MapHeaders": return target.isMapHeaders();
        case "matchonuriprefix":
        case "MatchOnUriPrefix": return target.isMatchOnUriPrefix();
        case "maxchunksize":
        case "MaxChunkSize": return target.getMaxChunkSize();
        case "maxheadersize":
        case "MaxHeaderSize": return target.getMaxHeaderSize();
        case "maxinitiallinelength":
        case "MaxInitialLineLength": return target.getMaxInitialLineLength();
        case "muteexception":
        case "MuteException": return target.isMuteException();
        case "nativetransport":
        case "NativeTransport": return target.isNativeTransport();
        case "needclientauth":
        case "NeedClientAuth": return target.isNeedClientAuth();
        case "nettyserverbootstrapfactory":
        case "NettyServerBootstrapFactory": return target.getNettyServerBootstrapFactory();
        case "networkinterface":
        case "NetworkInterface": return target.getNetworkInterface();
        case "noreplyloglevel":
        case "NoReplyLogLevel": return target.getNoReplyLogLevel();
        case "okstatuscoderange":
        case "OkStatusCodeRange": return target.getOkStatusCodeRange();
        case "options":
        case "Options": return target.getOptions();
        case "passphrase":
        case "Passphrase": return target.getPassphrase();
        case "path":
        case "Path": return target.getPath();
        case "port":
        case "Port": return target.getPort();
        case "producerpoolblockwhenexhausted":
        case "ProducerPoolBlockWhenExhausted": return target.isProducerPoolBlockWhenExhausted();
        case "producerpoolenabled":
        case "ProducerPoolEnabled": return target.isProducerPoolEnabled();
        case "producerpoolmaxidle":
        case "ProducerPoolMaxIdle": return target.getProducerPoolMaxIdle();
        case "producerpoolmaxtotal":
        case "ProducerPoolMaxTotal": return target.getProducerPoolMaxTotal();
        case "producerpoolmaxwait":
        case "ProducerPoolMaxWait": return target.getProducerPoolMaxWait();
        case "producerpoolminevictableidle":
        case "ProducerPoolMinEvictableIdle": return target.getProducerPoolMinEvictableIdle();
        case "producerpoolminidle":
        case "ProducerPoolMinIdle": return target.getProducerPoolMinIdle();
        case "protocol":
        case "Protocol": return target.getProtocol();
        case "receivebuffersize":
        case "ReceiveBufferSize": return target.getReceiveBufferSize();
        case "receivebuffersizepredictor":
        case "ReceiveBufferSizePredictor": return target.getReceiveBufferSizePredictor();
        case "reconnect":
        case "Reconnect": return target.isReconnect();
        case "reconnectinterval":
        case "ReconnectInterval": return target.getReconnectInterval();
        case "requesttimeout":
        case "RequestTimeout": return target.getRequestTimeout();
        case "reuseaddress":
        case "ReuseAddress": return target.isReuseAddress();
        case "reusechannel":
        case "ReuseChannel": return target.isReuseChannel();
        case "securityprovider":
        case "SecurityProvider": return target.getSecurityProvider();
        case "send503whensuspended":
        case "Send503whenSuspended": return target.isSend503whenSuspended();
        case "sendbuffersize":
        case "SendBufferSize": return target.getSendBufferSize();
        case "serverclosedchannelexceptioncaughtloglevel":
        case "ServerClosedChannelExceptionCaughtLogLevel": return target.getServerClosedChannelExceptionCaughtLogLevel();
        case "serverexceptioncaughtloglevel":
        case "ServerExceptionCaughtLogLevel": return target.getServerExceptionCaughtLogLevel();
        case "serverinitializerfactory":
        case "ServerInitializerFactory": return target.getServerInitializerFactory();
        case "serverpipelinefactory":
        case "ServerPipelineFactory": return target.getServerPipelineFactory();
        case "ssl":
        case "Ssl": return target.isSsl();
        case "sslclientcertheaders":
        case "SslClientCertHeaders": return target.isSslClientCertHeaders();
        case "sslcontextparameters":
        case "SslContextParameters": return target.getSslContextParameters();
        case "sslhandler":
        case "SslHandler": return target.getSslHandler();
        case "sync":
        case "Sync": return target.isSync();
        case "synchronous":
        case "Synchronous": return target.isSynchronous();
        case "tcpnodelay":
        case "TcpNoDelay": return target.isTcpNoDelay();
        case "textline":
        case "Textline": return target.isTextline();
        case "throwexceptiononfailure":
        case "ThrowExceptionOnFailure": return target.isThrowExceptionOnFailure();
        case "transferexception":
        case "TransferException": return target.isTransferException();
        case "transferexchange":
        case "TransferExchange": return target.isTransferExchange();
        case "truststorefile":
        case "TrustStoreFile": return target.getTrustStoreFile();
        case "truststoreresource":
        case "TrustStoreResource": return target.getTrustStoreResource();
        case "udpbytearraycodec":
        case "UdpByteArrayCodec": return target.isUdpByteArrayCodec();
        case "udpconnectionlesssending":
        case "UdpConnectionlessSending": return target.isUdpConnectionlessSending();
        case "unixdomainsocketpath":
        case "UnixDomainSocketPath": return target.getUnixDomainSocketPath();
        case "urldecodeheaders":
        case "UrlDecodeHeaders": return target.isUrlDecodeHeaders();
        case "usebytebuf":
        case "UseByteBuf": return target.isUseByteBuf();
        case "userelativepath":
        case "UseRelativePath": return target.isUseRelativePath();
        case "usingexecutorservice":
        case "UsingExecutorService": return target.isUsingExecutorService();
        case "workercount":
        case "WorkerCount": return target.getWorkerCount();
        case "workergroup":
        case "WorkerGroup": return target.getWorkerGroup();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "decodersaslist":
        case "DecodersAsList": return io.netty.channel.ChannelHandler.class;
        case "encodersaslist":
        case "EncodersAsList": return io.netty.channel.ChannelHandler.class;
        case "options":
        case "Options": return java.lang.Object.class;
        default: return null;
        }
    }
}


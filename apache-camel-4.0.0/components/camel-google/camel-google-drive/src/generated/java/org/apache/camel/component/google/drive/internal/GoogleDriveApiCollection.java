/*
 * Camel ApiCollection generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.google.drive.internal;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.camel.component.google.drive.GoogleDriveConfiguration;
import org.apache.camel.component.google.drive.DriveAboutEndpointConfiguration;
import org.apache.camel.component.google.drive.DriveChangesEndpointConfiguration;
import org.apache.camel.component.google.drive.DriveChannelsEndpointConfiguration;
import org.apache.camel.component.google.drive.DriveCommentsEndpointConfiguration;
import org.apache.camel.component.google.drive.DriveDrivesEndpointConfiguration;
import org.apache.camel.component.google.drive.DriveFilesEndpointConfiguration;
import org.apache.camel.component.google.drive.DrivePermissionsEndpointConfiguration;
import org.apache.camel.component.google.drive.DriveRepliesEndpointConfiguration;
import org.apache.camel.component.google.drive.DriveRevisionsEndpointConfiguration;
import org.apache.camel.component.google.drive.DriveTeamdrivesEndpointConfiguration;

import org.apache.camel.support.component.ApiCollection;
import org.apache.camel.support.component.ApiMethod;
import org.apache.camel.support.component.ApiMethodHelper;

/**
 * Camel {@link ApiCollection} for GoogleDrive
 */
public final class GoogleDriveApiCollection extends ApiCollection<GoogleDriveApiName, GoogleDriveConfiguration> {

    private static GoogleDriveApiCollection collection;

    private GoogleDriveApiCollection() {
        final Map<String, String> aliases = new HashMap<>();
        final Map<GoogleDriveApiName, ApiMethodHelper<? extends ApiMethod>> apiHelpers = new EnumMap<>(GoogleDriveApiName.class);
        final Map<Class<? extends ApiMethod>, GoogleDriveApiName> apiMethods = new HashMap<>();

        List<String> nullableArgs;

        aliases.clear();
        nullableArgs = Arrays.asList();
        apiHelpers.put(GoogleDriveApiName.DRIVE_ABOUT, new ApiMethodHelper<>(DriveAboutApiMethod.class, aliases, nullableArgs));
        apiMethods.put(DriveAboutApiMethod.class, GoogleDriveApiName.DRIVE_ABOUT);

        aliases.clear();
        nullableArgs = Arrays.asList();
        apiHelpers.put(GoogleDriveApiName.DRIVE_CHANGES, new ApiMethodHelper<>(DriveChangesApiMethod.class, aliases, nullableArgs));
        apiMethods.put(DriveChangesApiMethod.class, GoogleDriveApiName.DRIVE_CHANGES);

        aliases.clear();
        nullableArgs = Arrays.asList();
        apiHelpers.put(GoogleDriveApiName.DRIVE_CHANNELS, new ApiMethodHelper<>(DriveChannelsApiMethod.class, aliases, nullableArgs));
        apiMethods.put(DriveChannelsApiMethod.class, GoogleDriveApiName.DRIVE_CHANNELS);

        aliases.clear();
        nullableArgs = Arrays.asList();
        apiHelpers.put(GoogleDriveApiName.DRIVE_COMMENTS, new ApiMethodHelper<>(DriveCommentsApiMethod.class, aliases, nullableArgs));
        apiMethods.put(DriveCommentsApiMethod.class, GoogleDriveApiName.DRIVE_COMMENTS);

        aliases.clear();
        nullableArgs = Arrays.asList();
        apiHelpers.put(GoogleDriveApiName.DRIVE_DRIVES, new ApiMethodHelper<>(DriveDrivesApiMethod.class, aliases, nullableArgs));
        apiMethods.put(DriveDrivesApiMethod.class, GoogleDriveApiName.DRIVE_DRIVES);

        aliases.clear();
        nullableArgs = Arrays.asList();
        apiHelpers.put(GoogleDriveApiName.DRIVE_FILES, new ApiMethodHelper<>(DriveFilesApiMethod.class, aliases, nullableArgs));
        apiMethods.put(DriveFilesApiMethod.class, GoogleDriveApiName.DRIVE_FILES);

        aliases.clear();
        nullableArgs = Arrays.asList();
        apiHelpers.put(GoogleDriveApiName.DRIVE_PERMISSIONS, new ApiMethodHelper<>(DrivePermissionsApiMethod.class, aliases, nullableArgs));
        apiMethods.put(DrivePermissionsApiMethod.class, GoogleDriveApiName.DRIVE_PERMISSIONS);

        aliases.clear();
        nullableArgs = Arrays.asList();
        apiHelpers.put(GoogleDriveApiName.DRIVE_REPLIES, new ApiMethodHelper<>(DriveRepliesApiMethod.class, aliases, nullableArgs));
        apiMethods.put(DriveRepliesApiMethod.class, GoogleDriveApiName.DRIVE_REPLIES);

        aliases.clear();
        nullableArgs = Arrays.asList();
        apiHelpers.put(GoogleDriveApiName.DRIVE_REVISIONS, new ApiMethodHelper<>(DriveRevisionsApiMethod.class, aliases, nullableArgs));
        apiMethods.put(DriveRevisionsApiMethod.class, GoogleDriveApiName.DRIVE_REVISIONS);

        aliases.clear();
        nullableArgs = Arrays.asList();
        apiHelpers.put(GoogleDriveApiName.DRIVE_TEAMDRIVES, new ApiMethodHelper<>(DriveTeamdrivesApiMethod.class, aliases, nullableArgs));
        apiMethods.put(DriveTeamdrivesApiMethod.class, GoogleDriveApiName.DRIVE_TEAMDRIVES);

        setApiHelpers(apiHelpers);
        setApiMethods(apiMethods);
    }

    public GoogleDriveConfiguration getEndpointConfiguration(GoogleDriveApiName apiName) {
        GoogleDriveConfiguration result = null;
        switch (apiName) {
            case DRIVE_ABOUT:
                result = new DriveAboutEndpointConfiguration();
                break;
            case DRIVE_CHANGES:
                result = new DriveChangesEndpointConfiguration();
                break;
            case DRIVE_CHANNELS:
                result = new DriveChannelsEndpointConfiguration();
                break;
            case DRIVE_COMMENTS:
                result = new DriveCommentsEndpointConfiguration();
                break;
            case DRIVE_DRIVES:
                result = new DriveDrivesEndpointConfiguration();
                break;
            case DRIVE_FILES:
                result = new DriveFilesEndpointConfiguration();
                break;
            case DRIVE_PERMISSIONS:
                result = new DrivePermissionsEndpointConfiguration();
                break;
            case DRIVE_REPLIES:
                result = new DriveRepliesEndpointConfiguration();
                break;
            case DRIVE_REVISIONS:
                result = new DriveRevisionsEndpointConfiguration();
                break;
            case DRIVE_TEAMDRIVES:
                result = new DriveTeamdrivesEndpointConfiguration();
                break;
        }
        return result;
    }

    public static synchronized GoogleDriveApiCollection getCollection() {
        if (collection == null) {
            collection = new GoogleDriveApiCollection();
        }
        return collection;
    }
}
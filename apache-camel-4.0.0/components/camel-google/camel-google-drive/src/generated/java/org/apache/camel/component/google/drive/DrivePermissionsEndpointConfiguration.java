/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.google.drive;

import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.google.api.services.drive.Drive.Permissions}.
 */
@ApiParams(apiName = "drive-permissions", 
           description = "The permissions collection of methods",
           apiMethods = {@ApiMethod(methodName = "create", description="Creates a permission for a file or shared drive", signatures={"com.google.api.services.drive.Drive$Permissions$Create create(String fileId, com.google.api.services.drive.model.Permission content)"}), @ApiMethod(methodName = "delete", description="Deletes a permission", signatures={"com.google.api.services.drive.Drive$Permissions$Delete delete(String fileId, String permissionId)"}), @ApiMethod(methodName = "get", description="Gets a permission by ID", signatures={"com.google.api.services.drive.Drive$Permissions$Get get(String fileId, String permissionId)"}), @ApiMethod(methodName = "list", description="Lists a file's or shared drive's permissions", signatures={"com.google.api.services.drive.Drive$Permissions$List list(String fileId)"}), @ApiMethod(methodName = "update", description="Updates a permission with patch semantics", signatures={"com.google.api.services.drive.Drive$Permissions$Update update(String fileId, String permissionId, com.google.api.services.drive.model.Permission content)"})}, aliases = {})
@UriParams
@Configurer(extended = true)
public final class DrivePermissionsEndpointConfiguration extends GoogleDriveConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "create", description="The com.google.api.services.drive.model.Permission"), @ApiMethod(methodName = "update", description="The com.google.api.services.drive.model.Permission")})
    private com.google.api.services.drive.model.Permission content;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "create", description="The ID of the file or shared drive"), @ApiMethod(methodName = "delete", description="The ID of the file or shared drive"), @ApiMethod(methodName = "get", description="The ID of the file"), @ApiMethod(methodName = "list", description="The ID of the file or shared drive"), @ApiMethod(methodName = "update", description="The ID of the file or shared drive")})
    private String fileId;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "delete", description="The ID of the permission"), @ApiMethod(methodName = "get", description="The ID of the permission"), @ApiMethod(methodName = "update", description="The ID of the permission")})
    private String permissionId;

    public com.google.api.services.drive.model.Permission getContent() {
        return content;
    }

    public void setContent(com.google.api.services.drive.model.Permission content) {
        this.content = content;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }
}

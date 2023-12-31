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
package org.apache.camel.component.docker.it;

import com.github.dockerjava.api.command.AttachContainerCmd;
import com.github.dockerjava.api.command.AuthCmd;
import com.github.dockerjava.api.command.BuildImageCmd;
import com.github.dockerjava.api.command.CommitCmd;
import com.github.dockerjava.api.command.ConnectToNetworkCmd;
import com.github.dockerjava.api.command.ContainerDiffCmd;
import com.github.dockerjava.api.command.CopyArchiveFromContainerCmd;
import com.github.dockerjava.api.command.CopyArchiveToContainerCmd;
import com.github.dockerjava.api.command.CopyFileFromContainerCmd;
import com.github.dockerjava.api.command.CreateConfigCmd;
import com.github.dockerjava.api.command.CreateContainerCmd;
import com.github.dockerjava.api.command.CreateImageCmd;
import com.github.dockerjava.api.command.CreateNetworkCmd;
import com.github.dockerjava.api.command.CreateSecretCmd;
import com.github.dockerjava.api.command.CreateServiceCmd;
import com.github.dockerjava.api.command.CreateVolumeCmd;
import com.github.dockerjava.api.command.DisconnectFromNetworkCmd;
import com.github.dockerjava.api.command.DockerCmdExecFactory;
import com.github.dockerjava.api.command.EventsCmd;
import com.github.dockerjava.api.command.ExecCreateCmd;
import com.github.dockerjava.api.command.ExecStartCmd;
import com.github.dockerjava.api.command.InfoCmd;
import com.github.dockerjava.api.command.InitializeSwarmCmd;
import com.github.dockerjava.api.command.InspectConfigCmd;
import com.github.dockerjava.api.command.InspectContainerCmd;
import com.github.dockerjava.api.command.InspectExecCmd;
import com.github.dockerjava.api.command.InspectImageCmd;
import com.github.dockerjava.api.command.InspectNetworkCmd;
import com.github.dockerjava.api.command.InspectServiceCmd;
import com.github.dockerjava.api.command.InspectSwarmCmd;
import com.github.dockerjava.api.command.InspectSwarmNodeCmd;
import com.github.dockerjava.api.command.InspectVolumeCmd;
import com.github.dockerjava.api.command.JoinSwarmCmd;
import com.github.dockerjava.api.command.KillContainerCmd;
import com.github.dockerjava.api.command.LeaveSwarmCmd;
import com.github.dockerjava.api.command.ListConfigsCmd;
import com.github.dockerjava.api.command.ListContainersCmd;
import com.github.dockerjava.api.command.ListImagesCmd;
import com.github.dockerjava.api.command.ListNetworksCmd;
import com.github.dockerjava.api.command.ListSecretsCmd;
import com.github.dockerjava.api.command.ListServicesCmd;
import com.github.dockerjava.api.command.ListSwarmNodesCmd;
import com.github.dockerjava.api.command.ListTasksCmd;
import com.github.dockerjava.api.command.ListVolumesCmd;
import com.github.dockerjava.api.command.LoadImageAsyncCmd;
import com.github.dockerjava.api.command.LoadImageCmd;
import com.github.dockerjava.api.command.LogContainerCmd;
import com.github.dockerjava.api.command.LogSwarmObjectCmd;
import com.github.dockerjava.api.command.PauseContainerCmd;
import com.github.dockerjava.api.command.PingCmd;
import com.github.dockerjava.api.command.PruneCmd.Exec;
import com.github.dockerjava.api.command.PullImageCmd;
import com.github.dockerjava.api.command.PushImageCmd;
import com.github.dockerjava.api.command.RemoveConfigCmd;
import com.github.dockerjava.api.command.RemoveContainerCmd;
import com.github.dockerjava.api.command.RemoveImageCmd;
import com.github.dockerjava.api.command.RemoveNetworkCmd;
import com.github.dockerjava.api.command.RemoveSecretCmd;
import com.github.dockerjava.api.command.RemoveServiceCmd;
import com.github.dockerjava.api.command.RemoveSwarmNodeCmd;
import com.github.dockerjava.api.command.RemoveVolumeCmd;
import com.github.dockerjava.api.command.RenameContainerCmd;
import com.github.dockerjava.api.command.ResizeContainerCmd;
import com.github.dockerjava.api.command.ResizeExecCmd;
import com.github.dockerjava.api.command.RestartContainerCmd;
import com.github.dockerjava.api.command.SaveImageCmd;
import com.github.dockerjava.api.command.SaveImagesCmd;
import com.github.dockerjava.api.command.SearchImagesCmd;
import com.github.dockerjava.api.command.StartContainerCmd;
import com.github.dockerjava.api.command.StatsCmd;
import com.github.dockerjava.api.command.StopContainerCmd;
import com.github.dockerjava.api.command.TagImageCmd;
import com.github.dockerjava.api.command.TopContainerCmd;
import com.github.dockerjava.api.command.UnpauseContainerCmd;
import com.github.dockerjava.api.command.UpdateContainerCmd;
import com.github.dockerjava.api.command.UpdateServiceCmd;
import com.github.dockerjava.api.command.UpdateSwarmCmd;
import com.github.dockerjava.api.command.UpdateSwarmNodeCmd;
import com.github.dockerjava.api.command.VersionCmd;
import com.github.dockerjava.api.command.WaitContainerCmd;
import com.github.dockerjava.api.model.Version;

public class FakeDockerCmdExecFactory implements DockerCmdExecFactory {

    public static final String FAKE_VERSION = "Fake Camel Version 1.0";

    public FakeDockerCmdExecFactory() {
    }

    @Override
    public VersionCmd.Exec createVersionCmdExec() {
        return new VersionCmd.Exec() {
            @Override
            public Version exec(VersionCmd versionCmd) {
                return new Version() {
                    @Override
                    public String getVersion() {
                        return FAKE_VERSION;
                    }
                };
            }
        };
    }

    @Override
    public AuthCmd.Exec createAuthCmdExec() {
        return null;
    }

    @Override
    public InfoCmd.Exec createInfoCmdExec() {
        return null;
    }

    @Override
    public PingCmd.Exec createPingCmdExec() {
        return null;
    }

    @Override
    public ExecCreateCmd.Exec createExecCmdExec() {
        return null;
    }

    @Override
    public PullImageCmd.Exec createPullImageCmdExec() {
        return null;
    }

    @Override
    public PushImageCmd.Exec createPushImageCmdExec() {
        return null;
    }

    @Override
    public SaveImageCmd.Exec createSaveImageCmdExec() {
        return null;
    }

    @Override
    public CreateImageCmd.Exec createCreateImageCmdExec() {
        return null;
    }

    @Override
    public LoadImageCmd.Exec createLoadImageCmdExec() {
        return null;
    }

    @Override
    public LoadImageAsyncCmd.Exec createLoadImageAsyncCmdExec() {
        return null;
    }

    @Override
    public SearchImagesCmd.Exec createSearchImagesCmdExec() {
        return null;
    }

    @Override
    public RemoveImageCmd.Exec createRemoveImageCmdExec() {
        return null;
    }

    @Override
    public ListImagesCmd.Exec createListImagesCmdExec() {
        return null;
    }

    @Override
    public InspectImageCmd.Exec createInspectImageCmdExec() {
        return null;
    }

    @Override
    public ListContainersCmd.Exec createListContainersCmdExec() {
        return null;
    }

    @Override
    public CreateContainerCmd.Exec createCreateContainerCmdExec() {
        return null;
    }

    @Override
    public StartContainerCmd.Exec createStartContainerCmdExec() {
        return null;
    }

    @Override
    public InspectContainerCmd.Exec createInspectContainerCmdExec() {
        return null;
    }

    @Override
    public RemoveContainerCmd.Exec createRemoveContainerCmdExec() {
        return null;
    }

    @Override
    public WaitContainerCmd.Exec createWaitContainerCmdExec() {
        return null;
    }

    @Override
    public AttachContainerCmd.Exec createAttachContainerCmdExec() {
        return null;
    }

    @Override
    public ExecStartCmd.Exec createExecStartCmdExec() {
        return null;
    }

    @Override
    public InspectExecCmd.Exec createInspectExecCmdExec() {
        return null;
    }

    @Override
    public LogContainerCmd.Exec createLogContainerCmdExec() {
        return null;
    }

    @Override
    public CopyFileFromContainerCmd.Exec createCopyFileFromContainerCmdExec() {
        return null;
    }

    @Override
    public CopyArchiveFromContainerCmd.Exec createCopyArchiveFromContainerCmdExec() {
        return null;
    }

    @Override
    public CopyArchiveToContainerCmd.Exec createCopyArchiveToContainerCmdExec() {
        return null;
    }

    @Override
    public StopContainerCmd.Exec createStopContainerCmdExec() {
        return null;
    }

    @Override
    public ContainerDiffCmd.Exec createContainerDiffCmdExec() {
        return null;
    }

    @Override
    public KillContainerCmd.Exec createKillContainerCmdExec() {
        return null;
    }

    @Override
    public UpdateContainerCmd.Exec createUpdateContainerCmdExec() {
        return null;
    }

    @Override
    public RenameContainerCmd.Exec createRenameContainerCmdExec() {
        return null;
    }

    @Override
    public RestartContainerCmd.Exec createRestartContainerCmdExec() {
        return null;
    }

    @Override
    public CommitCmd.Exec createCommitCmdExec() {
        return null;
    }

    @Override
    public BuildImageCmd.Exec createBuildImageCmdExec() {
        return null;
    }

    @Override
    public TopContainerCmd.Exec createTopContainerCmdExec() {
        return null;
    }

    @Override
    public TagImageCmd.Exec createTagImageCmdExec() {
        return null;
    }

    @Override
    public PauseContainerCmd.Exec createPauseContainerCmdExec() {
        return null;
    }

    @Override
    public UnpauseContainerCmd.Exec createUnpauseContainerCmdExec() {
        return null;
    }

    @Override
    public EventsCmd.Exec createEventsCmdExec() {
        return null;
    }

    @Override
    public StatsCmd.Exec createStatsCmdExec() {
        return null;
    }

    @Override
    public CreateVolumeCmd.Exec createCreateVolumeCmdExec() {
        return null;
    }

    @Override
    public InspectVolumeCmd.Exec createInspectVolumeCmdExec() {
        return null;
    }

    @Override
    public RemoveVolumeCmd.Exec createRemoveVolumeCmdExec() {
        return null;
    }

    @Override
    public ListVolumesCmd.Exec createListVolumesCmdExec() {
        return null;
    }

    @Override
    public ListNetworksCmd.Exec createListNetworksCmdExec() {
        return null;
    }

    @Override
    public InspectNetworkCmd.Exec createInspectNetworkCmdExec() {
        return null;
    }

    @Override
    public CreateNetworkCmd.Exec createCreateNetworkCmdExec() {
        return null;
    }

    @Override
    public RemoveNetworkCmd.Exec createRemoveNetworkCmdExec() {
        return null;
    }

    @Override
    public ConnectToNetworkCmd.Exec createConnectToNetworkCmdExec() {
        return null;
    }

    @Override
    public DisconnectFromNetworkCmd.Exec createDisconnectFromNetworkCmdExec() {
        return null;
    }

    @Override
    public InitializeSwarmCmd.Exec createInitializeSwarmCmdExec() {
        return null;
    }

    @Override
    public InspectSwarmCmd.Exec createInspectSwarmCmdExec() {
        return null;
    }

    @Override
    public JoinSwarmCmd.Exec createJoinSwarmCmdExec() {
        return null;
    }

    @Override
    public LeaveSwarmCmd.Exec createLeaveSwarmCmdExec() {
        return null;
    }

    @Override
    public UpdateSwarmCmd.Exec createUpdateSwarmCmdExec() {
        return null;
    }

    @Override
    public ListServicesCmd.Exec createListServicesCmdExec() {
        return null;
    }

    @Override
    public CreateServiceCmd.Exec createCreateServiceCmdExec() {
        return null;
    }

    @Override
    public InspectServiceCmd.Exec createInspectServiceCmdExec() {
        return null;
    }

    @Override
    public UpdateServiceCmd.Exec createUpdateServiceCmdExec() {
        return null;
    }

    @Override
    public RemoveServiceCmd.Exec createRemoveServiceCmdExec() {
        return null;
    }

    @Override
    public LogSwarmObjectCmd.Exec logSwarmObjectExec(String s) {
        return null;
    }

    @Override
    public ListSwarmNodesCmd.Exec listSwarmNodeCmdExec() {
        return null;
    }

    @Override
    public InspectSwarmNodeCmd.Exec inspectSwarmNodeCmdExec() {
        return null;
    }

    @Override
    public RemoveSwarmNodeCmd.Exec removeSwarmNodeCmdExec() {
        return null;
    }

    @Override
    public UpdateSwarmNodeCmd.Exec updateSwarmNodeCmdExec() {
        return null;
    }

    @Override
    public ListTasksCmd.Exec listTasksCmdExec() {
        return null;
    }

    @Override
    public void close() {
        // Noop
    }

    @Override
    public Exec pruneCmdExec() {
        return null;
    }

    @Override
    public SaveImagesCmd.Exec createSaveImagesCmdExec() {
        return null;
    }

    @Override
    public ListSecretsCmd.Exec createListSecretsCmdExec() {
        return null;
    }

    @Override
    public CreateSecretCmd.Exec createCreateSecretCmdExec() {
        return null;
    }

    @Override
    public RemoveSecretCmd.Exec createRemoveSecretCmdExec() {
        return null;
    }

    @Override
    public ListConfigsCmd.Exec createListConfigsCmdExec() {
        return null;
    }

    @Override
    public InspectConfigCmd.Exec createInspectConfigCmdExec() {
        return null;
    }

    @Override
    public CreateConfigCmd.Exec createCreateConfigCmdExec() {
        return null;
    }

    @Override
    public RemoveConfigCmd.Exec createRemoveConfigCmdExec() {
        return null;
    }

    @Override
    public ResizeContainerCmd.Exec createResizeContainerCmdExec() {
        return null;
    }

    @Override
    public ResizeExecCmd.Exec createResizeExecCmdExec() {
        return null;
    }
}

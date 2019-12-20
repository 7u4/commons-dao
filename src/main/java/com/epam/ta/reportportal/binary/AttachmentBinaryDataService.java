/*
 * Copyright 2019 EPAM Systems
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.epam.ta.reportportal.binary;

import com.epam.ta.reportportal.commons.BinaryDataMetaInfo;
import com.epam.ta.reportportal.commons.ReportPortalUser;
import com.epam.ta.reportportal.entity.attachment.AttachmentMetaInfo;
import com.epam.ta.reportportal.entity.attachment.BinaryData;
import org.springframework.web.multipart.MultipartFile;

import java.util.Optional;

/**
 * @author <a href="mailto:ihar_kahadouski@epam.com">Ihar Kahadouski</a>
 */
public interface AttachmentBinaryDataService {

	Optional<BinaryDataMetaInfo> saveAttachment(Long projectId, MultipartFile file);

	void saveFileAndAttachToLog(MultipartFile file, AttachmentMetaInfo attachmentMetaInfo);

	void attachToLog(BinaryDataMetaInfo binaryDataMetaInfo, AttachmentMetaInfo attachmentMetaInfo);

	BinaryData load(Long fileId, ReportPortalUser.ProjectDetails projectDetails);

	void delete(String fileId);
}

/*
 * Copyright (C) 2018 EPAM Systems
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

package com.epam.ta.reportportal.entity.integration;

import com.epam.ta.reportportal.commons.JsonbUserType;

import java.io.Serializable;
import java.util.Map;

/**
 * @author Yauheni_Martynau
 */
public class IntegrationTypeDetails extends JsonbUserType implements Serializable {

	@Override
	public Class<?> returnedClass() {
		return IntegrationTypeDetails.class;
	}

	private Map<String, Object> details;

	public Map<String, Object> getDetails() {
		return details;
	}

	public void setDetails(Map<String, Object> details) {
		this.details = details;
	}
}

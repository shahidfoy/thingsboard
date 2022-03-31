/**
 * Copyright © 2016-2022 The Thingsboard Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.thingsboard.server.service.exportimport;

import org.thingsboard.server.common.data.ExportableEntity;
import org.thingsboard.server.common.data.id.EntityId;
import org.thingsboard.server.common.data.id.TenantId;
import org.thingsboard.server.service.exportimport.exporting.EntityExportSettings;
import org.thingsboard.server.service.exportimport.exporting.data.EntityExportData;
import org.thingsboard.server.service.exportimport.importing.EntityImportResult;
import org.thingsboard.server.service.exportimport.importing.EntityImportSettings;

import java.util.List;

public interface EntitiesExportImportService {

    <E extends ExportableEntity<I>, I extends EntityId> EntityExportData<E> exportEntity(TenantId tenantId, I entityId, EntityExportSettings exportSettings);

    <E extends ExportableEntity<I>, I extends EntityId> EntityImportResult<E> importEntity(TenantId tenantId, EntityExportData<E> exportData, EntityImportSettings importSettings);

    <E extends ExportableEntity<I>, I extends EntityId> List<EntityImportResult<E>> importEntities(TenantId tenantId, List<EntityExportData<E>> exportDataList, EntityImportSettings importSettings);

}

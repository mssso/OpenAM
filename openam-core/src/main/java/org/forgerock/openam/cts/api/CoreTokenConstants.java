/*
 * The contents of this file are subject to the terms of the Common Development and
 * Distribution License (the License). You may not use this file except in compliance with the
 * License.
 *
 * You can obtain a copy of the License at legal/CDDLv1.0.txt. See the License for the
 * specific language governing permission and limitations under the License.
 *
 * When distributing Covered Software, include this CDDL Header Notice in each file and include
 * the License file at legal/CDDLv1.0.txt. If applicable, add the following below the CDDL
 * Header, with the fields enclosed by brackets [] replaced by your own identifying
 * information: "Portions copyright [year] [name of copyright owner]".
 *
 * Copyright 2013-2016 ForgeRock AS.
 */
package org.forgerock.openam.cts.api;

/**
 * Responsible for collecting together all constants used in the Core Token Service.
 */
public final class CoreTokenConstants {

    /**
     * Debugging header, for all debug messages.
     */
    public static final String DEBUG_HEADER = "CTS: ";

    /**
     * Debugging header, for all async processing debug messages.
     */
    public static final String DEBUG_ASYNC_HEADER = "CTS Async: ";

    /**
     * Debug instance name for all CTS debugging.
     */
    public static final String CTS_DEBUG = "amCoreTokenService";

    /**
     * Debug instance name for all CTS Monitor debugging
     */
    public static final String CTS_MONITOR_DEBUG = "amCoreTokenMonitorService";

    /**
     * Debug instance name for the CTS Reaper.
     */
    public static final String CTS_REAPER_DEBUG = "amCTSReaper";

    /**
     * Debug instance name for the CTS Async processing.
     */
    public static final String CTS_ASYNC_DEBUG = "amCTSAsync";

    /**
     * Configuration properties for Cleanup and Health Check periods.
     */
    public static final String CLEANUP_PERIOD = "com.sun.identity.session.repository.cleanupRunPeriod";
    public static final String HEALTH_CHECK_PERIOD = "com.sun.identity.session.repository.healthCheckRunPeriod";
    /**
     * Globals public Constants, so not to pollute entire product.
     */
    public static final String SYS_PROPERTY_EXPIRED_SEARCH_LIMIT =
            "forgerock-openam-session-expired-search-limit";
    public static final String DEBUG_NAME = "amSessionRepository";

    public static final String OBJECT_CLASS = "objectClass";

    public static final String FR_CORE_TOKEN = "frCoreToken";
    /**
     * The name of the general purpose worker pool for the CTS.
     */
    public static final String CTS_WORKER_POOL = "CTSWorkerPool";
    public static final String CTS_SMS_CONFIGURATION = "CTSServerConfiguration";

    /**
     * The CTS token store can be either embedded or external. If external then more information is needed to connect.
     */
    public static final String CTS_STORE_LOCATION = "org.forgerock.services.cts.store.location";

    /**
     * The fully qualified name of the suffix where the tokens will be created.
     */
    public static final String CTS_ROOT_SUFFIX = "org.forgerock.services.cts.store.root.suffix";

    /**
     * Enable/disable SSL for the CTS token store connections.
     */
    public static final String CTS_STORE_SSL_ENABLED = "org.forgerock.services.cts.store.ssl.enabled";

    /**
     * Hostname where the CTS token store may be reached. This may point to a load balancer.
     */
    public static final String CTS_STORE_HOSTNAME = "org.forgerock.services.cts.store.directory.name";

    /**
     * Username for the token store connection.
     */
    public static final String CTS_STORE_USERNAME = "org.forgerock.services.cts.store.loginid";

    /**
     * Password for connecting to the token store.
     */
    public static final String CTS_STORE_PASSWORD = "org.forgerock.services.cts.store.password";

    /**
     * Maximum number of connections to the token store.
     */
    public static final String CTS_STORE_MAX_CONNECTIONS = "org.forgerock.services.cts.store.max.connections";

    /**
     * Default maximum number of connections to the token store.
     */
    public static final String CTS_STORE_MAX_CONNECTIONS_DEFAULT = "10";

    /**
     * Enable/disable the OpenDJ SDK's affinity based load balancing feature.
     */
    public static final String CTS_STORE_AFFINITY_ENABLED = "org.forgerock.services.cts.store.affinity.enabled";

    /**
     * The maximum duration in seconds to wait whilst placing tasks on the asynchronous work queue.
     */
    public static final String CTS_ASYNC_QUEUE_TIMEOUT = "org.forgerock.services.cts.async.queue.timeout";

    /**
     * The size of each asynchronous work queue.
     */
    public static final String CTS_ASYNC_QUEUE_SIZE = "org.forgerock.services.cts.async.queue.size";

    /**
     * Binding constant for the CTS Jackson Object Mapper.
     */
    public static final String OBJECT_MAPPER = "cts-json-object-mapper";

    private CoreTokenConstants() {
        // intentionally non-instantiable
    }
}

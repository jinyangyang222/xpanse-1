/*
 * SPDX-License-Identifier: Apache-2.0
 * SPDX-FileCopyrightText: Huawei Inc.
 */

package org.eclipse.xpanse.plugins.openstack.constants;

/**
 * Defines all the environment variables that must be set for the Openstack plugin to function
 * fully.
 */
public class OpenstackEnvironmentConstants {

    public static final String USERNAME = "OS_USERNAME";
    public static final String PASSWORD = "OS_PASSWORD";
    public static final String PROJECT = "OS_PROJECT_NAME";
    public static final String DOMAIN = "OS_DOMAIN_NAME";
    public static final String AUTH_URL = "OS_AUTH_URL";
    public static final String SERVICE_PROJECT = "OS_SERVICE_PROJECT";
    public static final String PROXY_HOST = "OS_PROXY_HOST";
    public static final String PROXY_PORT = "OS_PROXY_PORT";

    private OpenstackEnvironmentConstants() {
        // private constructor.
    }
}

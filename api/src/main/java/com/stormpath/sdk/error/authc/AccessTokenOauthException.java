/*
 * Copyright 2014 Stormpath, Inc.
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
package com.stormpath.sdk.error.authc;

import com.stormpath.sdk.error.Error;
import com.stormpath.sdk.resource.ResourceException;

/**
 * A sub-class of {@link ResourceException} representing an attempt to login via {@code Oauth} using an invalid {@code accessToken}.
 *
 * @since 1.0.RC
 */
public class AccessTokenOauthException extends OauthAuthenticationException {

    public static final String INVALID_ACCESS_TOKEN = "access_token is invalid.";

    public static final String EXPIRED_ACCESS_TOKEN = "access_token is expired.";

    public AccessTokenOauthException(Error error, String oauthError) {
        super(error, oauthError);
    }
}

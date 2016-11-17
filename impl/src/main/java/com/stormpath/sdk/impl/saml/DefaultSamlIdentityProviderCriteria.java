/*
 * Copyright 2013 Stormpath, Inc.
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
package com.stormpath.sdk.impl.saml;


import com.stormpath.sdk.impl.query.DefaultCriteria;
import com.stormpath.sdk.saml.SamlIdentityProviderCriteria;
import com.stormpath.sdk.saml.SamlIdentityProviderOptions;

/**
 * @since 1.2.0
 */
public class DefaultSamlIdentityProviderCriteria extends DefaultCriteria<SamlIdentityProviderCriteria, SamlIdentityProviderOptions> implements SamlIdentityProviderCriteria {

    public DefaultSamlIdentityProviderCriteria() {
        super(new DefaultSamlIdentityProviderOptions());
    }

    @Override
    public SamlIdentityProviderCriteria withAttributeMappingRules() {
        getOptions().withAttributeMappingRules();
        return this;
    }

    public SamlIdentityProviderCriteria withRegisteredSamlServiceProviders(){
        getOptions().withRegisteredSamlServiceProviders();
        return this;
    }
}
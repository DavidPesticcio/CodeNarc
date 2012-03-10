/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.codenarc.rule.convention

import org.codenarc.rule.AbstractClassReferenceRuleTestCase
import org.codenarc.rule.Rule

/**
 * Tests for HashtableIsObsoleteRule
 *
 * @author Chris Mair
 */
class HashtableIsObsoleteRule_HashtableTest extends AbstractClassReferenceRuleTestCase {

    final String className = 'Hashtable'
    final String violationMessage = "The $className class is obsolete"

    void testRuleProperties() {
        assert rule.priority == 2
        assert rule.name == 'HashtableIsObsolete'
    }

    protected Rule createRule() {
        new HashtableIsObsoleteRule()
    }
}
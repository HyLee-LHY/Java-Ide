/*
 * Copyright (c) 2015-2017 Angelo ZERR.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * <p>
 * SPDX-License-Identifier: EPL-2.0
 * <p>
 * Contributors:
 * Angelo Zerr <angelo.zerr@gmail.com> - initial API and implementation
 */
package io.github.rosemoe.sora.textmate.core.internal.css;

import org.w3c.css.sac.ElementSelector;

public abstract class AbstractElementSelector implements ElementSelector, ExtendedSelector {

    /** The namespace URI. */
    protected String namespaceURI;

    /** The local name. */
    protected String localName;

    /** Creates a new ElementSelector object. */
    protected AbstractElementSelector(String uri, String name) {
        namespaceURI = uri;
        localName = name;
    }

    @Override
    public String getNamespaceURI() {
        return namespaceURI;
    }

    @Override
    public String getLocalName() {
        return localName;
    }
}

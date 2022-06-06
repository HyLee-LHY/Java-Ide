/*
 * Copyright (c) 2015-2017 Angelo ZERR.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * <p>
 * SPDX-License-Identifier: EPL-2.0
 * <p>
 * Initial code from https://github.com/Microsoft/vscode-textmate/
 * Initial copyright Copyright (C) Microsoft Corporation. All rights reserved.
 * Initial license: MIT
 * <p>
 * Contributors:
 * - Microsoft Corporation: Initial code, written in TypeScript, licensed under MIT license
 * - Angelo Zerr <angelo.zerr@gmail.com> - translation and adaptation to Java
 */
package io.github.rosemoe.sora.textmate.core.model;

import io.github.rosemoe.sora.textmate.core.grammar.StackElement;

import java.util.Objects;

public class TMState {

    private TMState parentEmbedderState;
    private StackElement ruleStack;

    public TMState(TMState parentEmbedderState, StackElement ruleStatck) {
        this.parentEmbedderState = parentEmbedderState;
        this.ruleStack = ruleStatck;
    }

    public StackElement getRuleStack() {
        return ruleStack;
    }

    public void setRuleStack(StackElement ruleStack) {
        this.ruleStack = ruleStack;
    }

    @Override
    public TMState clone() {
        TMState parentEmbedderStateClone =
                this.parentEmbedderState != null ? this.parentEmbedderState.clone() : null;
        return new TMState(parentEmbedderStateClone, this.ruleStack);
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof TMState)) {
            return false;
        }
        TMState otherState = (TMState) other;
        return Objects.equals(this.parentEmbedderState, otherState.parentEmbedderState)
                && Objects.equals(this.ruleStack, otherState.ruleStack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.parentEmbedderState, this.ruleStack);
    }
}

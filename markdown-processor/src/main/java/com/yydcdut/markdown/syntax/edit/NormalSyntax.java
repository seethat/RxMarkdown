/*
 * Copyright (C) 2016 yydcdut (yuyidong2015@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.yydcdut.markdown.syntax.edit;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Editable;

import com.yydcdut.markdown.MarkdownConfiguration;
import com.yydcdut.markdown.live.EditToken;
import com.yydcdut.markdown.syntax.Syntax;

import java.util.ArrayList;
import java.util.List;

/**
 * Normal syntax, do nothing, parse nothing
 * <p>
 * Created by yuyidong on 16/7/2.
 */
class NormalSyntax implements Syntax {

    public NormalSyntax(@Nullable MarkdownConfiguration markdownConfiguration) {
    }

    @Override
    public boolean isMatch(@NonNull CharSequence charSequence) {
        return false;
    }

    @NonNull
    @Override
    public CharSequence format(@NonNull CharSequence charSequence) {
        return charSequence;
    }

    @NonNull
    @Override
    public List<EditToken> format(@NonNull Editable editable) {
        return new ArrayList<>();
    }
}

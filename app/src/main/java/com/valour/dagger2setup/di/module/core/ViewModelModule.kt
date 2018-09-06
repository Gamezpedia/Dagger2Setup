/*
 * Copyright 2018 Syed Asim Ali
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

package com.valour.dagger2setup.di.module.core

import android.arch.lifecycle.ViewModelProvider
import com.valour.dagger2setup.di.diutil.MyViewModelFactory
import dagger.Binds
import dagger.Module

/**
 * Created by Syed Asim Ali on 9/6/2018.
 */

@Module
internal abstract class ViewModelModule {

    @Binds
    internal abstract fun bindViewModelFactory(factory: MyViewModelFactory): ViewModelProvider.Factory
}
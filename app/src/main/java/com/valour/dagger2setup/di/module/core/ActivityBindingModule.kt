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

import com.valour.dagger2setup.di.module.app.LauncherModule
import com.valour.dagger2setup.di.scope.ActivityScoped
import com.valour.dagger2setup.view.LauncherActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by Syed Asim Ali on 9/6/2018.
 */

@Module
abstract class ActivityBindingModule {

    @ActivityScoped
    @ContributesAndroidInjector(modules = [LauncherModule::class])
    internal abstract fun launcherActivity(): LauncherActivity

    //ON BOARDING
    //LOGIN
    //REGISTER
    //MAIN
    //... ALL THE ACTIVITIES - will be here

}
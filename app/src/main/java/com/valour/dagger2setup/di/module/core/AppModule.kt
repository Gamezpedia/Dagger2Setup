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

import android.content.Context
import com.valour.dagger2setup.MainApp
import dagger.Module
import dagger.Provides

/**
 * Created by Syed Asim Ali on 9/6/2018.
 */

@Module
class AppModule {

    @Provides
    fun provideContext(application: MainApp): Context {
        return application.applicationContext
    }

    //Prefs DB
    /*@Singleton
    @Provides
    fun providePreferenceStorage(context: Context): PrefsDB {
        return PrefsDB(context)
    }*/

    //Uncomment to use
    /*@Provides
    fun provideWifiManager(context: Context): WifiManager =
            context.applicationContext.getSystemService(Context.WIFI_SERVICE) as WifiManager

    @Provides
    fun providesClipboardManager(context: Context): ClipboardManager =
            context.applicationContext.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager*/

}
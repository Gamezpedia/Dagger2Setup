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

package com.valour.dagger2setup.view.launcher

import android.arch.lifecycle.ViewModel
import android.util.Log
import javax.inject.Inject

/**
 * Created by Syed Asim Ali on 9/6/2018.
 */

class LauncherViewModel @Inject constructor() : ViewModel() {

    init {
        Log.e("LAUNCHER VIEW MODEL", "INITIALIZED")
    }
}
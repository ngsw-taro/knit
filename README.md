# knit

JUnit API set for Kotlin.

```kotlin
class UnitTest {
    @Test
    fun test() {
        (1 + 2).should be 3
    }
}
```

## Note

**Exprimental version**

It cannot recommended to use in your production now.

## Installation

```
repositories {
    maven {
        url 'http://dl.bintray.com/ngsw-taro/maven'
    }
}

dependencies {
    testCompile 'com.taroid.knit:knit:0.1.0'
}
```

## License

    Copyright 2016 Taro Nagasawa

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
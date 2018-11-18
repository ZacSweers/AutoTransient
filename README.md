auto-value-transient
====================

[![Build Status](https://travis-ci.org/hzsweers/auto-value-ignore.svg?branch=master)](https://travis-ci.org/hzsweers/auto-value-ignore)

A simple `@AVTransient` annotation for shared use in [auto-value-gson][avg], [auto-value-moshi][avm], and [auto-value-parcel][avp]. This library should be considered solely a shared common library for those three and only consumed transitively.

Usage:

```java
@AutoValue
public abstract class Taco {

  @AVTransient // or @AVTransient(BOTH)
  abstract Integer weight();

  @AVTransient(SERIALIZATION)
  abstract Boolean isBreakfast();

  @AVTransient(DESERIALIZATION)
  abstract Seasoning seasoning();

}
```

Types:
* `BOTH` - Should treat this property as transient for both serialization and deserialization. This is the default.
* `SERIALIZATION` - Should treat this property as transient for serialization only.
* `DESERIALIZATION` - Should treat this property as transient for deserialization only.

Caveats:
* While left to the implementations of the respective plugins, this should only be applied to optional properties. Applying to a primitive or required property could result in undefined behavior.


Download
--------

[![Maven Central](https://img.shields.io/maven-central/v/io.sweers.autovaluetransient/auto-value-transient.svg)](https://mvnrepository.com/artifact/io.sweers.autovaluetransient/auto-value-transient)
```gradle
compileOnly 'io.sweers.autovaluetransient:auto-value-transient:x.y.z'
```

Snapshots of the development version are available in [Sonatype's snapshots repository][snapshots].

License
-------

    Copyright (C) 2018 Zac Sweers

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

 [snapshots]: https://oss.sonatype.org/content/repositories/snapshots/
 [avg]: https://github.com/rharter/auto-value-gson
 [avm]: https://github.com/rharter/auto-value-moshi
 [avp]: https://github.com/rharter/auto-value-parcel

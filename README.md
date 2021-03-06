AutoTransient
=============

[![Build Status](https://travis-ci.org/ZacSweers/AutoTransient.svg?branch=master)](https://travis-ci.org/ZacSweers/AutoTransient)

A simple `@AutoTransient` annotation for shared use in [auto-value-gson][avg], [auto-value-moshi][avm], and [auto-value-parcel][avp]. This library should be considered solely a shared common library for those three and only consumed transitively.

Usage:

```java
@AutoValue
public abstract class Taco {

  @AutoTransient
  abstract Integer weight();

}
```

Usage notes:
* While left to the implementations of the respective plugins, this should only be applied to optional properties. Applying to a primitive or required property could result in undefined behavior.
* For serialization: This should be expected for both read and write behavior. There is no way to configure only one or the other via this annotation. Instead, consumers should write a delegating adapter for serialization that only calls through to the delegate for the desired serialization types.

Download
--------

[![Maven Central](https://img.shields.io/maven-central/v/io.sweers.autotransient/auto-value-transient.svg)](https://mvnrepository.com/artifact/io.sweers.autotransient/auto-value-transient)
```gradle
compileOnly 'io.sweers.autotransient:autotransient:x.y.z'
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

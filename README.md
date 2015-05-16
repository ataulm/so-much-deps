Flavored multi-module with interdependencies publishing.

Game is the leaf with two flavors.  
Cart depends on a flavor of Game, thus also has two flavors (explicitly defined with the same names).  
Demo relies on a particular flavor of Cart.

Running:

```bash
ataulm-lt:so-much-deps ataulm$ ./gradlew clean game:build game:bintrayUpload cart:build cart:bintrayUpload -PbintrayUser=whatever -PbintrayKey=whatever
```

will generate the 4 artifacts in your `~/.m2` repo:

- game-red
- game-blue
- cart-red
- cart-blue
 
All good, except the `cart-x` artifacts haven't got the correct poms:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd"
    xmlns="http://maven.apache.org/POM/4.0.0"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
  <modelVersion>4.0.0</modelVersion>
  <groupId>so-much-deps</groupId>
  <artifactId>cart-x</artifactId>
  <version>0.0.1</version>
  <packaging>aar</packaging>
</project>
```

There should also be a dependency node pointing to `game-x` with the same version.

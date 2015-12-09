# 목적
- groovy test (완료)
- groovy integration test(완료)
- subproject java (완료)
- main project use subproject jar(완료)
- git clone으로 실행가능
- 여러개의 main을 bin에서 제어
  lib/commons-collections.jar
  lib/submodule1.jar
  lib/submodule2.jar
  bin/start.sh : java -cp lib/* a.b.Main


# Test

    gradle test -i

# Run groovy

    groovy -cp lib/dog-1.0.jar:build/libs/gradle-best.jar main.groovy

# Run groovy by java

    java -cp build/libs/gradle-best.jar:lib/* groovy.ui.GroovyMain main.groovy
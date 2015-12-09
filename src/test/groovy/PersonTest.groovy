import org.junit.Test

import static groovy.test.GroovyAssert.shouldFail

class PersonTest {

  @Test
  void create() {
    def p = new Person('abc')
    assert p.name == 'abc'
  }

}
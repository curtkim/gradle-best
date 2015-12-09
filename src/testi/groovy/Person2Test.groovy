import org.junit.Test

class Person2Test {

  @Test
  void create() {
    def p = new Person('abc')
    assert p.name == 'abc2'
  }

}
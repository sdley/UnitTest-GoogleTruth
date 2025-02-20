# UnitTest-GoogleTruth
Découvrir et utiliser Google Truth pour écrire des tests unitaires plus expressifs en Java.

## Notes

### Notion de TestInstance
L'annotation @TestInstance(TestInstance.Lifecycle.PER_METHOD) est utilisée dans JUnit 5 pour contrôler la manière dont une instance de classe de test est créée pour chaque test.

Par défaut, chaque test a sa propre instance
Par défaut, JUnit 5 crée une nouvelle instance de la classe de test pour chaque test. Cela signifie que chaque méthode de test s’exécute dans une nouvelle instance de la classe de test, garantissant ainsi l'isolation entre les tests.

Exemple sans @TestInstance (comportement par défaut) :
```java
class MyTest {

    private int counter = 0;

    @Test
    void test1() {
        counter++;
        System.out.println("Test 1 : " + counter);  // Affiche "Test 1 : 1"
    }

    @Test
    void test2() {
        counter++;
        System.out.println("Test 2 : " + counter);  // Affiche "Test 2 : 1" (nouvelle instance)
    }
}
```
Ici, counter est réinitialisé à 0 pour chaque test, car JUnit crée une nouvelle instance de MyTest à chaque exécution.

Avec @TestInstance(TestInstance.Lifecycle.PER_METHOD)
L'option Lifecycle.PER_METHOD indique explicitement que chaque test aura une nouvelle instance de la classe de test (c’est le comportement par défaut de JUnit 5).

Exemple :
```java
@TestInstance(TestInstance.Lifecycle.PER_METHOD)  // Comportement par défaut
class MyTest {
    private int counter = 0;

    @Test
    void test1() {
        counter++;
        System.out.println("Test 1 : " + counter);  // Affiche "Test 1 : 1"
    }

    @Test
    void test2() {
        counter++;
        System.out.println("Test 2 : " + counter);  // Affiche "Test 2 : 1" (nouvelle instance)
    }
}
```

Ce comportement garantit que chaque test est isolé et indépendant des autres.

#### Quand utiliser @TestInstance(TestInstance.Lifecycle.PER_CLASS) ?
Si on remplace PER_METHOD par PER_CLASS :
```java
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MyTest {
    private int counter = 0;

    @Test
    void test1() {
        counter++;
        System.out.println("Test 1 : " + counter);  // Affiche "Test 1 : 1"
    }

    @Test
    void test2() {
        counter++;
        System.out.println("Test 2 : " + counter);  // Affiche "Test 2 : 2"
    }
}
```

- Ici, une seule instance de la classe de test est créée pour tous les tests.
- Cela permet de partager des états entre les tests.
- Inconvénient : Si un test modifie l’état de la classe, il peut impacter les autres tests.

- ✅ PER_METHOD (par défaut) :
    - Une nouvelle instance de la classe de test est créée pour chaque méthode de test.
    - Isolation garantie : chaque test s'exécute indépendamment.
    - Utilisé quand l’état ne doit pas être partagé entre les tests.

- ✅ PER_CLASS :
    - Une unique instance de la classe de test est utilisée pour tous les tests.
    - L’état peut être partagé entre les tests.
    - Utilisé lorsque l’initialisation est coûteuse et que les tests peuvent partager des ressources.

Dans notre cas (ListUtilsTest), PER_METHOD garantit que chaque test s’exécute indépendamment, sans risque d’impact d’un test sur un autre. 🚀

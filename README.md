Mocks 'n' Stubs
===============

Motivation
----------
 * Indirekte Ausgaben
 * "Behavior verification": Benutzt das SUT (system under test) seine Abhängigkeiten korrekt?
 * Abhängigkeiten können komplexe Implementierungen haben oder (noch) gar nicht implementiert sein
   Lernen über das Behaviour der Objekte
   --> Growing Object-Oriented Software, Guided by Tests

 * Decoupling von externen Komponenten
 * Simulation von Fehlersituationen (Paperjam, real-world: Datenbank weg, o.ä.)


Test Doubles
------------
 * Dummy
 * Stubs
 * Fake
 * Spies
 * Mocks

Hard-Coded Test-Double
----------------------
 * Self-shunt

Configurable Test-Double
------------------------
 * Mock Object

Dependency Injection
--------------------

Nachteile
---------
 * Abwägen von Performance der Tests und Reflection, die Laufzeit benötigt
 * Zahl der Mocks minimal halten
    * Vor allem für Commands verwenden, nicht für Queries (z.B. Repositories)


Quellen
-------

 * Avdi Grimm: ["Making a Mockery of TDD"](http://devblog.avdi.org/2011/09/06/making-a-mockery-of-tdd/)
 * Martin Fowler: ["Mocks Ain't Stubs"](http://martinfowler.com/articles/mocksArentStubs.html)
 * Steve Freeman, Tim Mackinnon, Nat Pryce, Joe Walnes: ["Mock Roles, Not Objects"](http://static.mockobjects.com/files/mockrolesnotobjects.pdf)
 * Steve Freeman, Nat Pryce: "Growing Object-Oriented Software, Guided by Tests"
 * Gerard Meszaros: "xUnit Test Patterns"
 * Frank Westphal: "Testgetriebene Entwicklung mit JUnit & FIT"
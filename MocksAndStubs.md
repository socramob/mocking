Mocks 'n' Stubs
===============

Motivation
----------
 * "Behavior verification": Benutzt das SUT (system under test) seine Abhängigkeiten korrekt?
 * Abhängigkeiten können komplexe Implementierungen haben oder (noch) gar nicht implementiert sein
   Lernen über das Behaviour der Objekte
   --> Growing Object-Oriented Software, Guided by Tests

 * Decoupling von externen Komponenten
 * Simulation von Fehlersituationen (Paperjam, real-world: Datenbank weg, o.ä.)


Test Doubles
------------
 * Stubs
 * Spies
 * Mocks

Nachteile
---------
 * Abwägen von Performance der Tests und Reflection, die Laufzeit benötigt
 * Zahl der Mocks minimal halten

Command-Query-Separation
------------------------

Quellen
-------

 * Avdi Grimm: ["Making a Mockery of TDD"](http://devblog.avdi.org/2011/09/06/making-a-mockery-of-tdd/)
 * Martin Fowler: ["Mocks Ain't Stubs"](http://martinfowler.com/articles/mocksArentStubs.html)
 * Steve Freeman, Tim Mackinnon, Nat Pryce, Joe Walnes: ["Mock Roles, Not Objects"](http://static.mockobjects.com/files/mockrolesnotobjects.pdf)
 * Steve Freeman, Nat Pryce: "Growing Object-Oriented Software, Guided by Tests"
 * Gerard Meszaros: "xUnit Test Patterns"
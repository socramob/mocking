Mocks 'n' Stubs
===============

Motivation
----------
 * Indirekte Eingaben/Ausgaben
 * "Behavior verification": Benutzt das SUT (system under test) seine Abhängigkeiten korrekt?
 * Abhängigkeiten können komplexe Implementierungen haben oder (noch) gar nicht implementiert sein

 * Simulieren von externen Komponenten
 * Testen von Fehlersituationen (Paperjam, Datenbankverbindung abgebrochen, o.ä.)


Test Doubles
------------
 * Dummy: Platzhalter innerhalb des Test-Setups
 * Fake: Ersetzt eine Komponente (Service, Repository, etc.)
 * Stubs: Rudimentäre Funktionalität --> Hard-Coded Rückgabewerte
 * Spies: Flag wird bei Aufruf gesetzt
    * Self-shunt
 * Mocks: Konfigurierbare Test Doubles (z.B. per Reflection, etc.)

Nachteile
---------
 * Abwägen von Performance der Tests und Reflection, die Laufzeit benötigt
 * Zahl der Mocks minimal halten
    * Vor allem für Commands verwenden, nicht für Queries (z.B. Repositories)

Ausblick
--------
 * Mit Mocking über das Behaviour der Objekte lernen
    * Ohne Implementierung der umgegebenen Objekte zu kennen
    * --> Growing Object-Oriented Software, Guided by Tests

Quellen
-------
 * Martin Fowler: ["Mocks Ain't Stubs"](http://martinfowler.com/articles/mocksArentStubs.html)
 * Steve Freeman, Tim Mackinnon, Nat Pryce, Joe Walnes: ["Mock Roles, Not Objects"](http://static.mockobjects.com/files/mockrolesnotobjects.pdf)
 * Steve Freeman, Nat Pryce: "Growing Object-Oriented Software, Guided by Tests"
 * Avdi Grimm: ["Making a Mockery of TDD"](http://devblog.avdi.org/2011/09/06/making-a-mockery-of-tdd/)
 * Gerard Meszaros: "xUnit Test Patterns"
 * Frank Westphal: "Testgetriebene Entwicklung mit JUnit & FIT"

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
 * <a href="http://www.amazon.de/gp/product/0321503627/ref=as_li_ss_tl?ie=UTF8&tag=socramob-21&linkCode=as2&camp=1638&creative=19454&creativeASIN=0321503627">Steve Freeman, Nat Pryce: "Growing Object-Oriented Software, Guided by Tests"</a><img src="http://www.assoc-amazon.de/e/ir?t=socramob-21&l=as2&o=3&a=0321503627" width="1" height="1" border="0" alt="" style="border:none !important; margin:0px !important;" />
 * Avdi Grimm: ["Making a Mockery of TDD"](http://devblog.avdi.org/2011/09/06/making-a-mockery-of-tdd/)
 * <a href="http://www.amazon.de/gp/product/0131495054/ref=as_li_ss_tl?ie=UTF8&tag=socramob-21&linkCode=as2&camp=1638&creative=19454&creativeASIN=0131495054">Gerard Meszaros: "xUnit Test Patterns"</a><img src="http://www.assoc-amazon.de/e/ir?t=socramob-21&l=as2&o=3&a=0131495054" width="1" height="1" border="0" alt="" style="border:none !important; margin:0px !important;" />
 * <a href="http://www.amazon.de/gp/product/3898642208/ref=as_li_ss_tl?ie=UTF8&tag=socramob-21&linkCode=as2&camp=1638&creative=19454&creativeASIN=3898642208">Frank Westphal: "Testgetriebene Entwicklung mit JUnit & FIT"</a><img src="http://www.assoc-amazon.de/e/ir?t=socramob-21&l=as2&o=3&a=3898642208" width="1" height="1" border="0" alt="" style="border:none !important; margin:0px !important;" />


 * [EasyMock](http://easymock.org/)
 * [Mockito](http://mockito.org/)

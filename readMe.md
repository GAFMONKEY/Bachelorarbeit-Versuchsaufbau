# Struktur
- `scripts` enthält die Skripte zum generieren der Tests mittels der Testobjekte
- Die Testobjekte befinden sich im Ordner `testobjects`
- Die generierten Artefakte `tests-data`
  - `acceptance-criteria` enthät die Akzeptanzkriterien die zur Generierung der Tests mittels LLMs verwendet wurden
  - `classes-under-test` enthalten die Klassen für welche Tests generiert wurden
  - `generated-tests` enthalten die final generierten Tests
  - `prompts` enthalten die Prompttemplates, welche für die Testgenerierung verwendet wurden
  - `reports` enthalten die Auswertungen zu Testabdeckung, Mutation Coverage und eine Auswertung der qualitativen Metriken für die generierten Tests
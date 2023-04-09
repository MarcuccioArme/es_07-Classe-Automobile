# es_07-Classe-Automobile
### Definizione di una classe AUTOMOBILE che rappresenta un'automobile

Progettare una classe di nome Automobile.

Tale classe prevede i seguenti attributi:
- Marca: String
- Colore: String
- Clindrata: int
- StatoMotore: Boolean //Per rappresentare lo stato dell'auto: accessa o spenta
- Serbatoio: int //Per rappresentare il numero di litri presenti nel serbatoio

La classe deve prevedere i seguenti metodi:
- public Automobile (pMarca: str, pColore: str, pCilindrata: int)
<br> il costruttore che imposta la quantita iniziale di benzina a zero e lo stato a falso (spento);
- public toString () 
<br> che mostra tutte le informazioni dell'automobile;
- public AvviaMotore () 
<br> che accende il motore, ossia modifica lo stato in acceso;
- public RifornimentoLitri (plitri: int) 
<br> che aggiunge la quantità di litri desiderata al Serbatoio controllando che non superi la capacità massima del serbatoio

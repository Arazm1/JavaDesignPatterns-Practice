Osa 1 – Patternin tunnistaminen

createTransport(type) → Factory Method ✅

Dark/Light theme + yhteensopivat komponentit → Abstract Factory ✅

attach/detach/notify → Observer ✅

Objektin käyttäytyminen tilan mukaan → State ✅

Pyynnön välittäminen ketjussa → Chain of Responsibility ✅

Kaikki oikeat.

Osa 2 – Patternin idea

Decorator – selitys oikein, kuvaa lisätoiminnallisuuden dynaamista kerrostamista ilman aliluokkien räjäyttämistä.

State vs Strategy – selitys oikein: Strategy = eri algoritmeja, State = käyttäytyminen sisäisen tilan mukaan.

Composite – selitys oikein: puumainen rakenne, Leaf vs Composite, käytetään hierarkioihin kuten organisaatioihin.

Template Method – oikein: algoritmin runko abstraktissa luokassa, aliluokat voivat määritellä yksityiskohtia.

Osa 3 – Use case -tunnistus

Graafinen editori (Shape, Circle, Rectangle, Group) → Composite ✅

Yksi konfiguraatio-olio → Singleton ✅

Maksutavat (CreditCard, PayPal…) → Strategy ✅

Virheenkäsittely ketjussa → Chain of Responsibility ✅

Osa 4 – Code completion

Singleton-koodi → oikein

Observer notify-metodi → oikein

Strategy pay-metodi → puuttuu, oikea olisi esim.:

strategy.pay(amount);

Template Method abstract-metodit → oikein

Osa 5 – Tosi / Epätosi

Strategy kapseloi algoritmeja → T ✅

Singleton sallii useita instansseja → F ✅

Composite mahdollistaa yksittäisten ja ryhmien käsittelyn samalla tavalla → T ✅

Observer vaatii jatkuvaa kyselyä → F ✅

Template Method määrittelee algoritmin rungon yliluokassa → T ✅

Decorator muuttaa objektin luokan ajon aikana → F ✅
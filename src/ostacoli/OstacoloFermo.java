// Pong — Programmazione Orientata agli Oggetti e Laboratori, Udine, a.a. 2026-27
package ostacoli;

import geometria.Rettangolo;

/** Comportamento comune agli ostacoli che non si spostano. */
abstract class OstacoloFermo implements Ostacolo {
    private final Rettangolo area;

    protected OstacoloFermo(Rettangolo area) {
        this.area = area;
    }

    @Override
    public Rettangolo getArea() { return area; }

    @Override
    public void avanza() {}
}

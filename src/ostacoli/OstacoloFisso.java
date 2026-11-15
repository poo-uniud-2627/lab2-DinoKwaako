// Pong — Programmazione Orientata agli Oggetti e Laboratori, Udine, a.a. 2026-27
package ostacoli;

import geometria.Rettangolo;
import java.awt.Color;

/** L'ostacolo fisso: un muretto grigio che non si rompe mai. Colpito, non cambia niente. */
public class OstacoloFisso extends OstacoloFermo {
    public static final Color GRIGIO = new Color(150, 150, 150);

    /** Pretende: area non è null. */
    public OstacoloFisso(Rettangolo area) {
        super(area);
    }

    /** Non è mai rotto, quindi non lancia mai l'eccezione; e il colpo non cambia niente. */
    @Override
    public void colpisci(Ostacoli campo) {
        // niente: l'ostacolo fisso non si rompe
    }

    @Override
    public boolean isRotto() { return false; }

    @Override
    public Color getColore() { return GRIGIO; }
}

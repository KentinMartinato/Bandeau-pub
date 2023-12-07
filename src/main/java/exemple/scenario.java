package exemple;

import bandeau.Bandeau; 
import java.util.ArrayList;
import java.util.List;

public class scenario {
    private List<EffectWrapper> effects;

    public scenario() {
        this.effects = new ArrayList<>();
    }

    public void ajouterEffet(effet effect, int repeatCount) {
        effects.add(new EffectWrapper(effect, repeatCount));
    }

    public void play(Bandeau bandeau) {
        for (EffectWrapper effectWrapper : effects) {
            for (int i = 0; i < effectWrapper.getRepeatCount(); i++) {
                effectWrapper.getEffect().play(bandeau);
            }
        }
    }

    private static class EffectWrapper {
        private effet effect;
        private int repeatCount;

        public EffectWrapper(effet effect, int repeatCount) {
            this.effect = effect;
            this.repeatCount = repeatCount;
        }

        public effet getEffect() {
            return effect;
        }

        public int getRepeatCount() {
            return repeatCount;
        }
    }
}

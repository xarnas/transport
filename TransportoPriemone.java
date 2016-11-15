package transportas;

public abstract class TransportoPriemone {
   protected int greitis;
   protected Kryptis kriptis;
   protected Pozicija pozicija;
   
   protected abstract int greitis();
   protected abstract Kryptis kryptis();
   protected abstract void nustatytiGreiti(int greitis);
   protected abstract void pirmyn();
   protected abstract Pozicija pozicija();
}

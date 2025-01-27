public class Coordinata {
        private double longitudine, latitudine ;
        public Coordinata (double longitudine, double latitudine) {
            this.latitudine = latitudine ;
            this.longitudine = longitudine ;
        }
        public void  ControllaCoordinate () throws IllegalArgumentException {

            if ((longitudine < -180.00) || (longitudine > 180.00)) {
                throw new IllegalArgumentException("Longitudine non valida") ;
            }
            if ((latitudine< -90.00)||(latitudine > 90.00)) {
                throw new IllegalArgumentException("Latitudine non valida") ;
            }
        }

    }


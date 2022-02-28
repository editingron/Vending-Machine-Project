
    public class JunkFood {


        // member variables
        private String name;
        private int price;
        private String eatMessage;
        public String location;
        public String type;

        //constructor
        public JunkFood(String name, int price, String eatMessage, String location, String type) {
            this.name = name;
            this.price = price;
            this.eatMessage = eatMessage;
            this.location = location;
            this.type = type;

            {
                //getters
                public String getName () {
                return name;
            }

                public int getPrice () {
                return price;
            }

                public String getEatMessage () {
                return eatMessage;
            }

                public String getLocation () {
                return location;
            }

                public String getType () {
                return type;
            }
                //setters
                public void setName (String name){
                this.name = name;
            }

                public void setprice (String price){
                this.name = price;
            }
                public void setEatMessage (String eatMessage){
                this.name = eatMessage;
            }
                public void setLocation (String location){
                this.name = location;
            }
                public void setType (String type){
                this.name = type;

            }
            }
        }
    }
}
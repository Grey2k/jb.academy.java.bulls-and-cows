package bullscows;

public record Turn(Integer input, Integer secret) {

    public Integer bulls() {
        return 0;
    }

    public Integer cows() {
        return 0;
    }

    public boolean match() {
        return input.toString().length() == bulls() && cows() == 0;
    }

    public Integer secret() {
       if(match()) {
           return secret;
       }

       throw new RuntimeException("Answer didn't match secret yet!");
    }
}

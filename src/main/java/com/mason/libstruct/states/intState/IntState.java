package com.mason.libstruct.states.intState;

public interface IntState extends IntQuery{


    void setState(int state);


    static IntState defaultInstance(){
        return new IntState(){

            int state;

            @Override
            public void setState(int state){
                this.state = state;
            }

            @Override
            public int getState(){
                return state;
            }
        };
    }

}

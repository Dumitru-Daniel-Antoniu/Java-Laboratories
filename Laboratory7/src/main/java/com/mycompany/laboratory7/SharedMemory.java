package com.mycompany.laboratory7;

import java.util.List;
import java.util.ArrayList;

public class SharedMemory {
    private final List<Token> tokens = new ArrayList<>();
    public SharedMemory(int n) {
        
    }
    public synchronized Token extractTokens(int howMany) {
        List<Token> extracted = new ArrayList<>();
        for (int i = 0; i < howMany; i++) {
            if(tokens.isEmpty()) {
                break;
            }
            extracted.add();
        }
        return extracted;
    }
}

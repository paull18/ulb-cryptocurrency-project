/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulb.cryptography.cryptocurrency;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author masterulb
 */
public class Blockchain implements Serializable{
    
    private static final long serialVersionUID = 12358903454875L;
    private List<Block> listOfBlocks;

    /**
     *
     * @param listOfBlocks
     */
    public Blockchain(List<Block> listOfBlocks) {
        this.listOfBlocks = listOfBlocks;
    }

    /**
     *
     */
    public Blockchain() {
        this.listOfBlocks = new LinkedList<>();
    }

    /**
     *
     * @param block
     */
    public void addToBlockchain(Block block) {
        this.listOfBlocks.add(block);
    }

    /**
     * @return the listOfBlocks
     */
    public List<Block> getListOfBlocks() {
        return listOfBlocks;
    }

    /**
     * @param listOfBlocks the listOfBlocks to set
     */
    public void setListOfBlocks(List<Block> listOfBlocks) {
        this.listOfBlocks = listOfBlocks;
    }
}

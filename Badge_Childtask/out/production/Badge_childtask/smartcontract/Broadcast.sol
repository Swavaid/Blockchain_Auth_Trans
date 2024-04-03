// SPDX-License-Identifier: GPL-3.0
pragma solidity >=0.7.0 <0.9.0;

contract BadgeProtocal{


    event Published(
        
        string[] DataOnTheBoard);

    


    function Broadcast(string[] memory broadcastData)  public payable returns(string[] memory){


        emit Published(
            broadcastData
            );



        return broadcastData;
        
    }



}
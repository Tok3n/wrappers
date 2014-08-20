#!/bin/env ruby

###############################################
##                                           ##
##      Tok3n wrapper client for APIv2       ##
##      By Tok3n Solutions SAPI CV           ##
##      September 2014                       ##
##                                           ##
##      Basic use, $ irb:                    ##
## > require tok3n                           ##
## > user = tok3n.client('client_id', 'api_key')##
## >                                        ##
###############################################

module Client
    
    def init(self, client_id, api_key, host=API_HOST, port=API_PORT)
      
      

module validation
  
#!/bin/env python

###############################################
##                                           ##
##      Tok3n wrapper client for APIv2       ##
##      By Tok3n Solutions SAPI CV           ##
##      September 2014                       ##
##                                           ##
##      Basic use:                           ##
## >> from tok3n.client import Client        ##
## >> user = get_user('client_id', 'api_key')##
## >>                                        ##
###############################################

__title__ = 'tok3n'
__version__ = get_distribuion('tok3n').version
__author__ = 'Tok3n Solutions'
__license__ = 'AFLv2'

"""
tok3n.client
~~~~~~~~~~~~

This module implement the Tok3n APIv2.
:license: AFLv2, see LICENSE for more details.
"""

class client(object):
  
  def __init__(self, client_id, api_key, host=API_HOST, port=API_PORT, secure=True):
    self.client_id = client_id
    self.api_key = api_key
    self.host = host
    self.port = port
    self.secure = secure
    
  
  @staticmethod
  def fromCredsFile(filename, host=API_HOST, port=API_PORT, secure=True):
    credentials = Credentials(filename)
    if credentials.available():
      credentials.load()
    else:
      credentials.input()
      credentials.save()
    (client_id, api_key) = credentials.get()
    return Client(client_id, api_key, host, port, secure)
    
    
class validation(object):
  
  def __init__(self,type = OTP):
    self.
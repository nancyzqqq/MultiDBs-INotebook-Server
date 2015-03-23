#!/bin/bash
# This is a script to set up the "fresh" AWS server to the most updated state.
# Any required settings made on the AWS server should take a note to this file. Such as create database table, or insert some rows.

# Installation
sudo apt-get install maven
sudo apt-get install git
sudo apt-get install openjdk-7-jdk
sudo apt-get install mysql-server
sudo apt-get install nginx
sudo apt-get install python-pip
sudo pip install ipython
sudo apt-get install python-zmq
sudo pip install Jinja2
sudo pip install tornado
sudo pip install jsonschema

# Create project directory
cd /opt
sudo mkdir project
cd project

# Clone repositories from github
sudo git clone https://github.com/infsci2711/MultiDBs-INotebook-IPython-Extention.git
sudo git clone https://github.com/infsci2711/MultiDBs-INotebook-Server.git
sudo git clone https://github.com/infsci2711/MultiDBs-INotebook-WebClient.git
sudo git clone https://github.com/infsci2711/MultiDBs-Utils.git

# Create symlink to the client code in the project folder
cd /usr/share/nginx
sudo rm -R html
sudo ln -sv /opt/project/MultiDBs-INotebook-WebClient html
# Make "project" folder searchable
sudo chmod +x /opt/project

# Create ipython notebook directory
cd /usr
sudo mkdir notebook
cd notebook

# Set notebook server
ipython
In [1]: from IPython.lib import passwd
In [2]: passwd()
Enter password: notebook
Verify password: notebook
Out[2]: 'sha1:e704eb4d8f11:c83c9c8785390abf5d90c366083cd497b0c149b6'
# Self-assigned certificate
sudo openssl req -x509 -nodes -days 365 -newkey rsa:1024 -keyout mycert.pem -out mycert.pem
ipython notebook --certfile=mycert.pem
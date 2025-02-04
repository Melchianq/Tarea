# Tarea
Para deberes de la universidad

#Instalación de apache
sudo dnf install httpd -y

#Iniciamos servicios de apache
sudo systemctl start httpd

#Verificacomos el status del servicio
sudo systemctl status httpd

#Configuración del archivo httpd.conf
/etc/httpd/conf/httpd.conf
DocumentRoot "/var/www/html/mi_sitio"

#Reiniciamos el servicio
sudo systemctl restart httpd

int pinNo = 2;

void setup() {
  Serial.begin(9600);
  pinMode(pinNo, OUTPUT);
}

void loop() {
  if (Serial.available()) {
    char ch = Serial.read();
    if (ch == '1') {
      digitalWrite(pinNo, HIGH);
      Serial.println("ON");
    } else if (ch == '0') {
      digitalWrite(pinNo, LOW);
      Serial.println("OFF");
    }
  }
}

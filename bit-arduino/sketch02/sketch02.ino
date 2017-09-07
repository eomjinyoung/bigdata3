int inPin = 4;
void setup() {
  Serial.begin(9600);
  pinMode(inPin, INPUT);
}

void loop() {
  int button = digitalRead(inPin);
  Serial.println(button);
  delay(100);
}

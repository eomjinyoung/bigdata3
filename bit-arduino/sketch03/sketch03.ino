int outPin = 3;

void setup() {
  Serial.begin(9600);
  pinMode(outPin, OUTPUT);
}

void loop() {
  // 리턴 값: 0 ~ 1023 
  int value = analogRead(A0);
  analogWrite(outPin, value / 4);
  Serial.println(value);
  delay(100);
}

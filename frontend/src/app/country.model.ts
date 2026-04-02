export interface Flag {
  svg: string;
  alt: string;
}

export interface Country {
  code: string;
  name: string;
  capital: string;
  population: number;
  flag: Flag;
}

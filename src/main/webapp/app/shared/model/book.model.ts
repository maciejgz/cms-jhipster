import dayjs from 'dayjs';

export interface IBook {
  id?: number;
  title?: string | null;
  quicklookContentType?: string | null;
  quicklook?: string | null;
  bookFileContentType?: string | null;
  bookFile?: string | null;
  releaseDate?: string | null;
}

export const defaultValue: Readonly<IBook> = {};

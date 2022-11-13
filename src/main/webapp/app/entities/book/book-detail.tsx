import React, { useEffect } from 'react';
import { Link, useParams } from 'react-router-dom';
import { Button, Row, Col } from 'reactstrap';
import { Translate, openFile, byteSize, TextFormat } from 'react-jhipster';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';

import { APP_DATE_FORMAT, APP_LOCAL_DATE_FORMAT } from 'app/config/constants';
import { useAppDispatch, useAppSelector } from 'app/config/store';

import { getEntity } from './book.reducer';

export const BookDetail = () => {
  const dispatch = useAppDispatch();

  const { id } = useParams<'id'>();

  useEffect(() => {
    dispatch(getEntity(id));
  }, []);

  const bookEntity = useAppSelector(state => state.book.entity);
  return (
    <Row>
      <Col md="8">
        <h2 data-cy="bookDetailsHeading">
          <Translate contentKey="cmsJhipsterApp.book.detail.title">Book</Translate>
        </h2>
        <dl className="jh-entity-details">
          <dt>
            <span id="id">
              <Translate contentKey="global.field.id">ID</Translate>
            </span>
          </dt>
          <dd>{bookEntity.id}</dd>
          <dt>
            <span id="title">
              <Translate contentKey="cmsJhipsterApp.book.title">Title</Translate>
            </span>
          </dt>
          <dd>{bookEntity.title}</dd>
          <dt>
            <span id="quicklook">
              <Translate contentKey="cmsJhipsterApp.book.quicklook">Quicklook</Translate>
            </span>
          </dt>
          <dd>
            {bookEntity.quicklook ? (
              <div>
                {bookEntity.quicklookContentType ? (
                  <a onClick={openFile(bookEntity.quicklookContentType, bookEntity.quicklook)}>
                    <img src={`data:${bookEntity.quicklookContentType};base64,${bookEntity.quicklook}`} style={{ maxHeight: '30px' }} />
                  </a>
                ) : null}
                <span>
                  {bookEntity.quicklookContentType}, {byteSize(bookEntity.quicklook)}
                </span>
              </div>
            ) : null}
          </dd>
          <dt>
            <span id="bookFile">
              <Translate contentKey="cmsJhipsterApp.book.bookFile">Book File</Translate>
            </span>
          </dt>
          <dd>
            {bookEntity.bookFile ? (
              <div>
                {bookEntity.bookFileContentType ? (
                  <a onClick={openFile(bookEntity.bookFileContentType, bookEntity.bookFile)}>
                    <Translate contentKey="entity.action.open">Open</Translate>&nbsp;
                  </a>
                ) : null}
                <span>
                  {bookEntity.bookFileContentType}, {byteSize(bookEntity.bookFile)}
                </span>
              </div>
            ) : null}
          </dd>
          <dt>
            <span id="releaseDate">
              <Translate contentKey="cmsJhipsterApp.book.releaseDate">Release Date</Translate>
            </span>
          </dt>
          <dd>{bookEntity.releaseDate ? <TextFormat value={bookEntity.releaseDate} type="date" format={APP_DATE_FORMAT} /> : null}</dd>
        </dl>
        <Button tag={Link} to="/book" replace color="info" data-cy="entityDetailsBackButton">
          <FontAwesomeIcon icon="arrow-left" />{' '}
          <span className="d-none d-md-inline">
            <Translate contentKey="entity.action.back">Back</Translate>
          </span>
        </Button>
        &nbsp;
        <Button tag={Link} to={`/book/${bookEntity.id}/edit`} replace color="primary">
          <FontAwesomeIcon icon="pencil-alt" />{' '}
          <span className="d-none d-md-inline">
            <Translate contentKey="entity.action.edit">Edit</Translate>
          </span>
        </Button>
      </Col>
    </Row>
  );
};

export default BookDetail;
